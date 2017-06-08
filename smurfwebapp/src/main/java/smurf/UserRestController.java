package smurf;

import java.util.Collections;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/rest/users")

public class UserRestController {

	private final UserRepository userRepository;

	@Autowired
	UserRestController(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/{userId}")
	User getProfile(@PathVariable Long userId) {
		this.validateUser(userId);
		return this.userRepository.findOne(userId);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/get_auth_token")
	Map<String,String> getAuthToken(@PathVariable String email, @PathVariable String password) {
		User user = this.userRepository.findByEmailAndPassword(email, password).orElse(null);
		if (user != null) {
			return Collections.singletonMap("token", "45h5h3tb5hjbt5fgjdfngij");
		} else {
			return Collections.singletonMap("token", "false");
		}

	}

	private void validateUser(Long userId) {
		this.userRepository.findById(userId).orElseThrow(() -> new UserNotFoundException(userId));
	}
}
