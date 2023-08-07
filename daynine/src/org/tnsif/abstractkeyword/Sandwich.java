//Program to demonstrate the abstract method
package org.tnsif.abstractkeyword;

public abstract class Sandwich {

	//concrete method
	void showReceipe()
	{
		System.out.println("I don't know how to prepare sandwich 😆😆😆");
	}
	
	//absctract method
	abstract void prepare();
	abstract void prepare(int a);
}