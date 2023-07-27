package org.tnsif.multilevelinheritance;

public class State extends Country {
	
	//data members
	private String stateName;
	private int stateCode;
	
	
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public int getStateCode() {
		return stateCode;
	}
	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}
	
	
	@Override
	public String toString() {
		return "State [stateName=" + stateName + ", stateCode=" + stateCode + ", toString()=" + super.toString() + "]";
	}
	
	
	public State() {
		super();
		System.out.println("Default Constructor of State Class");
	}
	
	public State(String contryName, int countyCode, String stateName, int stateCode) {
		super(contryName, countyCode);
		this.stateName = stateName;
		this.stateCode = stateCode;
		
	}
	
	
	
	
	
	
	

}
