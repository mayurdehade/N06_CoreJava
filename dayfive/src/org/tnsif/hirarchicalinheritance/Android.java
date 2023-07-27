//Base class
package org.tnsif.hirarchicalinheritance;

public class Android {
	
	//private data members
	private String brand;
	private String soltType;
	
	//getters and setters
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getSoltType() {
		return soltType;
	}
	public void setSoltType(String soltType) {
		this.soltType = soltType;
	}


	//constructor
	public Android(String brand, String soltType) {
		super();
		this.brand = brand;
		this.soltType = soltType;
	}
	
	
	@Override
	public String toString() {
		return "Android [brand=" + brand + ", soltType=" + soltType + "]";
	}
	
	
	
	
	
}
