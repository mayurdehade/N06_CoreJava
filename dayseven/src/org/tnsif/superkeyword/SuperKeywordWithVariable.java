//Program to demonstrate the super keyword with variables
package org.tnsif.superkeyword;

class Building
{
	int floors = 23;
	String name = "Anantha-Astha";
}

class Flat extends Building
{
	String name = "Mayur Dehade";
	
	void print()
	{
		/* 
		 * If parent class and child class variable name are same, and 
		 * if you want to access parent class variable inside the child
		 * class, use super.variablename
		 */
		System.out.println(super.name);
		System.out.println(name);
	}
	
}


public class SuperKeywordWithVariable {

	public static void main(String[] args) {
		
		Flat f = new Flat();
		f.print();

	}

}
