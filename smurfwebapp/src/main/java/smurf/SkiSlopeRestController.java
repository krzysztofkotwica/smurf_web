package smurf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/rest/ski_slopes")

public class SkiSlopeRestController {

	private final SkiSlopeRepository skiSlopeRepository;

	@Autowired
	SkiSlopeRestController(SkiSlopeRepository skiSlopeRepository) {
		this.skiSlopeRepository = skiSlopeRepository;
	}

	@RequestMapping(method = RequestMethod.GET)
	List<SkiSlope> readSkiSlope() {
		return this.skiSlopeRepository.findAll();

	}
}
