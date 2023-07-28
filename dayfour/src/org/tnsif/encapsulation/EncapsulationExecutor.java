//Program to demonstrate on encapsulation 
//Drive Class
package org.tnsif.encapsulation;

public class EncapsulationExecutor {

	public static void main(String[] args) {
		
		SBI s = new SBI();
		
		s.setAccType("Saving Account");
		s.setAccNo(124532156482L);
		s.setAtmCardNo(6522290076963563L);
		s.setPinNo(254);
		
		
		//below line will call to toString()method
		System.out.println(s);
		
		
		System.out.println("Account Type: "+s.getAccType());
		System.out.println("Account No: "+s.getAccNo());
		System.out.println("ATM Card No: "+s.getAtmCardNo());
		System.out.println("ATM Card Pin No: "+s.getPinNo());

	}

}
