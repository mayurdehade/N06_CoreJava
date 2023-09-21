//Program to demonstrate Increment and Decrement Operator
package org.tnsif.operators;

public class IncrementDecrementOperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=23, y=6;
		int result1 = x++ + ++y; //23 + 7
		System.out.println(result1); //30
		System.out.println(x); //24
		System.out.println(y); //7
		
		
		int a=23, b=6;
		int result2 = a-- + --b; //23 + 5
		System.out.println(result2); //28
		System.out.println(a); //22
		System.out.println(b); //5
		
	}

}
