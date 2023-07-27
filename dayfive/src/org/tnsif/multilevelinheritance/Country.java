package org.tnsif.multilevelinheritance;

public class Country {

	//data members
	private String contryName;
	private int countyCode;
	
	//getter and setter
	public String getNationality() {
		return contryName;
	}
	public void setNationality(String contryName) {
		this.contryName = contryName;
	}
	public int getCountyCode() {
		return countyCode;
	}
	public void setCountyCode(int countyCode) {
		this.countyCode = countyCode;
	}
	
	
	@Override
	public String toString() {
		return "Country [contryName=" + contryName + ", countyCode=" + countyCode + "]";
	}
	
	//constructor
	public Country() {
		super();
		System.out.println("Default Constructor of Contry Class");
	}
	
	public Country(String contryName, int countyCode) {
		super();
		this.contryName = contryName;
		this.countyCode = countyCode;
	}
	
	
	
	
	
	
	
	
}
