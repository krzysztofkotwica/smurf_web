package smurf;

import smurf.SkiSlope;

public class MockSkiSlope {

	public MockSkiSlope() {
		this.setSkiSlope1();
		this.setSkiSlope2();
		this.setSkiSlope3();
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

	private SkiSlope skislope1;
	private SkiSlope skislope2;
	private SkiSlope skislope3;

	private void setSkiSlope1() {
		SkiSlope ski = new SkiSlope();
		ski.setAddress("Zieleniec");
		ski.setCountry("pl");
		ski.setContent("Zieleniec Ski Arena to jeden z najlepszych...");
		ski.setImage_url("/img/ziel.jpg");
		ski.setIs_favourite(true);
		ski.setLatitude("50.3355");
		ski.setLongitude("16.3896");
		ski.setTemperature("-10");
		ski.setTitle("ZIELENIEC");
		this.skislope1 = ski;
	}

	private void setSkiSlope2() {
		SkiSlope ski = new SkiSlope();
		ski.setAddress("ČERNÁ HORA");
		ski.setCountry("cz");
		ski.setContent("Największy z pięciu ośrodków SkiResortu ČERNÁ HORA - PEC.");
		ski.setImage_url("/img/czernahora.jpg");
		ski.setIs_favourite(true);
		ski.setLatitude("50.6523");
		ski.setLongitude("15.7416");
		ski.setTemperature("-33");
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
		ski.setIs_favourite(true);
		ski.setLatitude("50.8183");
		ski.setLongitude("15.5169");
		ski.setTemperature("-4");
		ski.setTitle("SZKLARSKA POREBA");
		this.skislope3 = ski;
	}
}
