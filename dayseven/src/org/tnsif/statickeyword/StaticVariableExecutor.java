//program to demonstrate the use of static keyword to variable
package org.tnsif.statickeyword;

public class StaticVariableExecutor {

	//static variable
	/*
	 * if any variable is outside the main function and if you want to access that variable
	 * to the main method then declare that variable as static
	 */
	static String str = "MET BKC, Nashik";
	
	public static void main(String[] args) {
		
		//we can access the str variable using the object and by declaring the variable as static
		
//		StaticVariableExecutor s = new StaticVariableExecutor();
//		System.out.println(s.str);
		
		System.out.println(str);

	}

}
