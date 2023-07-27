//child class
package org.tnsif.hirarchicalinheritance;

public class Tiramisu extends Android {

	//private data members
	private int version;
	
	//getters and setters
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}

	//parameterize constructor
	public Tiramisu(String brand, String soltType, int version) {
		super(brand, soltType);
		this.version = version;
	}
	
	
	@Override
	public String toString() {
		return "Tiramisu [version=" + version + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
	
}
