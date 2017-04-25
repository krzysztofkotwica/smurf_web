package smurf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Arrays;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SmurfwebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmurfwebappApplication.class, args);
	}

	@Bean
	CommandLineRunner init(SkiSlopeRepository skiSlopeRepository) {
		return (evt) -> Arrays.asList("krzysiek.kotwica@gmail.com").forEach(a -> {
			SkiSlope ski = new SkiSlope();
			ski.setAddress("Zieleniec");
			ski.setCountry("pl");
			ski.setContent("Zieleniec Ski Arena to jeden z najlepszych...");
			ski.setImage_url("/img/123.jpg");
			ski.setIs_favourite(true);
			ski.setLatitude("50.3355");
			ski.setLongitude("16.3896");
			ski.setTemperature("18");
			ski.setTitle("ZIELENIEC");
			skiSlopeRepository.save(ski);
		});
	}
}
