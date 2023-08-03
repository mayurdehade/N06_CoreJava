//program to demonstrate the final keyword
package org.tnsif.finalkeyword;

public class FinalVariable {

	//Final variable must be initialize during declaration
	//final int x; 
	
	final float SALARY	 = 67000.45f;
	
	void print() {
		//we can't change the value of final variable
//		SALARY = 70000.02f;
		
		System.out.println("Salary is: "+SALARY);
	}
}
