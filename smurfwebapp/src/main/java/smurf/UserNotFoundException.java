package smurf;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
class UserNotFoundException extends RuntimeException {

	public UserNotFoundException(String userId) {
		super("could not find user with name '" + userId + "'.");
	}

	public UserNotFoundException(Long userId) {
		super("could not find user with id '" + userId + "'.");
	}

}
