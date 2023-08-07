//Program to demonstrate the abstract method
package org.tnsif.abstractkeyword;

public class CheeseCornSandwich extends Sandwich{

	//override the abstract method
	@Override
	void prepare() {
		System.out.println("Cheese Corn Sandwich 😋😋😋😋");
		
	}

	@Override
	void prepare(int a) {
		
		System.out.println("Overloaded Cheese Corn Sandwich 😋😋😋😋");
	}

}
