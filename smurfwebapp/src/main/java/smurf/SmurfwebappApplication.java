package smurf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Arrays;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import smurf.MockSkiSlope;

@SpringBootApplication
public class SmurfwebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmurfwebappApplication.class, args);
	}

	@Bean
	CommandLineRunner init(SkiSlopeRepository skiSlopeRepository, UserRepository userRepository,
			UserSkiSlopeRepository ussr) {
		return (evt) -> Arrays.asList("SkiSlope").forEach(a -> {
			MockSkiSlope mockMenager = new MockSkiSlope();
			SkiSlope ski1 = mockMenager.getSkiSlope1();
			SkiSlope ski2 = mockMenager.getSkiSlope2();
			SkiSlope ski3 = mockMenager.getSkiSlope3();
			User user = mockMenager.getUser();
			UserSkiSlope uss = mockMenager.getUserSkiSlope();
			skiSlopeRepository.save(ski1);
			skiSlopeRepository.save(ski2);
			skiSlopeRepository.save(ski3);
			userRepository.save(user);
			ussr.save(uss);
		});
	}
}
