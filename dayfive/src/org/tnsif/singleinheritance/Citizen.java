//Program to demonstrate on single inheritance
//Base Class
package org.tnsif.singleinheritance;

public class Citizen {
	
	//Private data members
	private String city;
	private int pincode;
	private String area;
	private long adharNo;
	
	//getters and setters
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public long getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(long adharNo) {
		this.adharNo = adharNo;
	}
	
	//toString() method
	@Override
	public String toString() {
		return "Citizen [city=" + city + ", pincode=" + pincode + ", area=" + area + ", adharNo=" + adharNo + "]";
	}
	
	
	//default constructor
	public Citizen() {
		System.out.println("Citizen-Parent Class");
	}
	
	//parameterized constructor
	public Citizen(String city, int pincode, String area, long adharNo) {
		//used for call parent class variable
		super();
		this.city = city;
		this.pincode = pincode;
		this.area = area;
		this.adharNo = adharNo;
	}
	
	
	
	
	
	
	
	
	
}
