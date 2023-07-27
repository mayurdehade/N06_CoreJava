package org.tnsif.multilevelinheritance;

public class City extends State {

	private String cityName;
	private int cityCode;
	
	//getter and setter
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public int getCityCode() {
		return cityCode;
	}
	public void setCityCode(int cityCode) {
		this.cityCode = cityCode;
	}
	
	
	@Override
	public String toString() {
		return "City [cityName=" + cityName + ", cityCode=" + cityCode + ", toString()=" + super.toString() + "]";
	}
	
	
	//Constructor
	public City(String contryName, int countyCode, String stateName, int stateCode, String cityName, int cityCode) {
		super(contryName, countyCode, stateName, stateCode);
		this.cityName = cityName;
		this.cityCode = cityCode;
	}
	
	
	
	
}
