package org.tnsif.finalkeyword;

public class HP extends Laptop {

	final String processor = "Intel i5";
	
	//we can't override final method
//	void display() {
//		System.out.println(processor);
//	}
	
	
	//we can overload final method
	void display(String processor) {
		System.out.println(processor);
	}
}
