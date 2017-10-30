package smurf;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class UserSkiSlope {

	@JsonIgnore
	@OneToOne()
	private User user;

	public User getUser() {
		return user;
	}

	@OneToOne()
	private SkiSlope skiSlope;
	
	public SkiSlope getSkiSlope() {
		return skiSlope;
	}

	@Id
	@GeneratedValue
	private Long id;

	public Long getId() {
		return id;
	}

	public UserSkiSlope(User user, SkiSlope skiSlope) {
		this.user = user;
		this.skiSlope = skiSlope;
	}

	UserSkiSlope() {
	}
}