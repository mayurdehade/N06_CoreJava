package org.tnsif.finalkeyword;
//Program to demonstrate on final method

//Final class cannot be inherit
//public final class Laptop
public class Laptop {

	final String processor = "Intel i3";
	
	//final method
	final void display() {
		System.out.println(processor);
	}
}
