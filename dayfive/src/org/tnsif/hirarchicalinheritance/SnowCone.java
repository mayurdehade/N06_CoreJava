package org.tnsif.hirarchicalinheritance;

public class SnowCone extends Android {

	//private data members
	private int version;
	
	//getters and setters
	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}


	public SnowCone(String brand, String soltType, int version) {
		super(brand, soltType);
		this.version = version;
		
	}

	@Override
	public String toString() {
		return "SnowCone [version=" + version + ", toString()=" + super.toString() + "]";
	}

	
}
