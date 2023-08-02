//Program to demonstrate Super Keyword With Method
package org.tnsif.superkeyword;

//parent class
class MET
{
	String chairman = "Chhagan Bhujbal";
	void displayName()
	{
		System.out.println("Owner is: "+chairman);
	}
}

//child class
class BKC extends MET 
{
	String chairman = "Shefali Bhujbal";
	void displayName() {
		/*
		 * If parent class and child class method name are same, 
		 * and if you want to access that method then use,
		 * super.methodName();
		 */
		super.displayName();
		System.out.println("Owner is: "+chairman);
	}
}

public class SuperKeywordWithMethod {

	public static void main(String[] args) {
		
		BKC b = new BKC();
		b.displayName();
	}

}
