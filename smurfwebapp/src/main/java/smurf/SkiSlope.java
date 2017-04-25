package smurf;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class SkiSlope {

	@Id
	@GeneratedValue
	private Long id;

	public Long getId() {
		return id;
	}

	@JsonIgnore
	private String title;
	private String content;
	private String latitude;
	private String longitude;
	private String address;
	private String country;
	private String image_url;
	private String temperature;
	private Boolean is_favourite;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getImage_url() {
		return image_url;
	}

	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}

	public String getTemperature() {
		return temperature;
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	public Boolean getIs_favourite() {
		return is_favourite;
	}

	public void setIs_favourite(Boolean is_favourite) {
		this.is_favourite = is_favourite;
	}

	SkiSlope() {
	}
}