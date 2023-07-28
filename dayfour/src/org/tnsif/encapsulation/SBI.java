//Program to demonstrate on encapsulation 
/*
 * Encapsulation achieves a data hiding using private access
 * specifier
 */
package org.tnsif.encapsulation;

public class SBI {

	//Private data members 
	private String accType;
	private long accNo;
	private long atmCardNo;
	private int pinNo;
	
	
	//Getters and Setters methods
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public long getAccNo() {
		return accNo;
	}
	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}
	public long getAtmCardNo() {
		return atmCardNo;
	}
	public void setAtmCardNo(long atmCardNo) {
		this.atmCardNo = atmCardNo;
	}
	public int getPinNo() {
		return pinNo;
	}
	public void setPinNo(int pinNo) {
		this.pinNo = pinNo;
	}
	
	
	@Override
	public String toString() {
		return "SBI [accType=" + accType + ", accNo=" + accNo + ", atmCardNo=" + atmCardNo + ", pinNo=" + pinNo + "]";
	}
	
	
	
	
}
