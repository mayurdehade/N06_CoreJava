//Program to demonstrate the Method Overloading
//compile-time polymorphism (Static or Early Binding)
//Inheritance is not allowed
package org.tnsif.polymorphism;

class MLA {
	//same method with different number of parameters or different types of parameters 
	static String corruption(int x) {
		return ("Corruption Amount is: "+x);
	}

	static String corruption(int x, String name) {
		
		return ("Name is: "+name+" Corruption Amount is: "+x);
	}
}

public class MethodOverloadingExecutor {
	
	
	public static void main(String[] args) {
		
		//calling to corruption method with different parameters
		System.out.println(MLA.corruption(4152431));
		System.out.println(MLA.corruption(200000, "Milind Ghegadmal"));

	}

}
