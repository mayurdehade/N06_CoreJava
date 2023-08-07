//Program to demonstrate on function interface
//Functional interface are only having exactly one abstract method
package org.tnsif.interfaceexecutor;

@FunctionalInterface
public interface ChandrayaanThree {
	
	//Functional interface contains exactly one abstract method
	//we can use static and default method inside the functional interface
	void status();
//	void display();
	
	static void show() {
		System.out.println("This is static method inside the functional interface!");
	}

}
