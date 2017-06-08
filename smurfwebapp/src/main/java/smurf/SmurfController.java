package smurf;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")

public class SmurfController {

	@RequestMapping(method = RequestMethod.GET)
	String example() {
		return "Smurf RESTApi for Smurf App";
	}
}
