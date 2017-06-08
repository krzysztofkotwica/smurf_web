package smurf;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/rest/favourite")

public class UserSkiSlopeRestController {

	private final UserSkiSlopeRepository userSkiSlopeRepository;

	@Autowired
	UserSkiSlopeRestController(UserSkiSlopeRepository userSkiSlopeRepository) {
		this.userSkiSlopeRepository = userSkiSlopeRepository;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/{userId}")
	List<SkiSlope> favouritSkiSlopes(@PathVariable Long userId) {
		List<SkiSlope> skislopes = this.userSkiSlopeRepository.findSkiSlopeByUserId(userId);
		return this.addWeatherForList(skislopes);
	}
	
	private List<SkiSlope> addWeatherForList(List<SkiSlope> skislopes) {
		List <SkiSlope> returningList = new ArrayList<SkiSlope>();
		for (int i=0; i < skislopes.size(); i++) {
			SkiSlope slope = skislopes.get(i);
			returningList.add(this.addWeather(slope));
		}
		return returningList;
	}
	
	private SkiSlope addWeather(SkiSlope skislope) {
		skislope.setTemperature(this.getTemperature(skislope.getAddress()));
		return skislope;
	}

	private String getTemperature(String location) {

		try {
			String baseUrl = "http://query.yahooapis.com/v1/public/yql?q={query}&format={json}";
			String query = "select item from weather.forecast where u='c' AND woeid in (select woeid from geo.places(1) where text=\""
					+ location + "\")";
			String json = "json";
			RestTemplate restTemplate = new RestTemplate();
			String jsonStr = restTemplate.getForObject(baseUrl, String.class, query, json);
			JSONObject jsonObj = new JSONObject(jsonStr);
			return jsonObj.getJSONObject("query").getJSONObject("results").getJSONObject("channel")
					.getJSONObject("item").getJSONObject("condition").getString("temp");
		} catch (JSONException e) {
			return "error";
		}

	}
}
