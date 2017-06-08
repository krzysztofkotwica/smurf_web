package smurf;

import smurf.SkiSlope;

public class MockSkiSlope {

	public MockSkiSlope() {
		this.setSkiSlope1();
		this.setSkiSlope2();
		this.setSkiSlope3();
		this.setUser();
		this.setUserSkiSlope();
	}

	public SkiSlope getSkiSlope1() {
		return this.skislope1;
	}

	public SkiSlope getSkiSlope2() {
		return this.skislope2;
	}

	public SkiSlope getSkiSlope3() {
		return this.skislope3;
	}
	
	public User getUser() {
		return this.user;
	}
	
	public UserSkiSlope getUserSkiSlope() {
		return this.userSkiSlope;
	}

	private SkiSlope skislope1;
	private SkiSlope skislope2;
	private SkiSlope skislope3;
	private User user;
	private UserSkiSlope userSkiSlope;

	private void setSkiSlope1() {
		SkiSlope ski = new SkiSlope();
		ski.setAddress("Zieleniec");
		ski.setCountry("pl");
		ski.setContent("Zieleniec Ski Arena to jeden z najlepszych...");
		ski.setImage_url("/img/ziel.jpg");
		ski.setLatitude(50.3355);
		ski.setLongitude(16.3896);
		ski.setTemperature("0");
		ski.setTitle("ZIELENIEC");
		this.skislope1 = ski;
	}

	private void setSkiSlope2() {
		SkiSlope ski = new SkiSlope();
		ski.setAddress("Czarna góra");
		ski.setCountry("cz");
		ski.setContent("Największy z pięciu ośrodków SkiResortu ČERNÁ HORA - PEC.");
		ski.setImage_url("/img/czernahora.jpg");
		ski.setLatitude(50.6523);
		ski.setLongitude(15.7416);
		ski.setTemperature("0");
		ski.setTitle("CERNA HORA");
		this.skislope2 = ski;
	}

	private void setSkiSlope3() {
		SkiSlope ski = new SkiSlope();
		ski.setAddress("Szklarska Poręba");
		ski.setCountry("pl");
		ski.setContent(
				"Ski Arena Szrenica oferuje 12 km tras z systemem dośnieżania pokrywającym 100% obszaru przeznaczonego do uprawiania narciarstwa zjazdowego. ");
		ski.setImage_url("/img/szklarska.jpg");
		ski.setLatitude(50.8183);
		ski.setLongitude(15.5169);
		ski.setTemperature("0");
		ski.setTitle("SZKLARSKA POREBA");
		this.skislope3 = ski;
	}
	
	private void setUser() {
		User user = new User();
		user.setEmail("kkotwica@kkotwica.pl");
		user.setUsername("Krzysztof Kotwica");
		user.setPassword("qwerty");
		this.user = user;
	}
	
	private void setUserSkiSlope() {
		UserSkiSlope uss = new UserSkiSlope(this.user, this.skislope1);
		this.userSkiSlope = uss;
	}
}
