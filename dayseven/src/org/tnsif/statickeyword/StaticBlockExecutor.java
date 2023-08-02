//program to demonstrate the static block
package org.tnsif.statickeyword;

public class StaticBlockExecutor {
	
	String str;
	static float salary;
	
	//static block is used to initialized the value of static variable
	//We can't initialize any non-static variable inside the static block
	static {
		salary = 541245.45f;
//		str = "BKC"; //error
		
	}
	
	static void print() {
		System.out.println("Salary: "+salary);
	}

	public static void main(String[] args) {
		// main function is static and hence it calls static block, method and variables by default
		print();
		System.out.println("salary");
	}

}
