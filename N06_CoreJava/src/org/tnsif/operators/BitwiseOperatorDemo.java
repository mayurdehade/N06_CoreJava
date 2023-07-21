//Program to demonstrate Bitwise and Shifting Operator
package org.tnsif.operators;

public class BitwiseOperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 13, y=9;
		System.out.println(x&y); //and operator
		System.out.println(x|y); //or operator
		System.out.println(x^y); //xor operator
		
		System.out.println(x>>y); //right shift
		System.out.println(x<<y); //left shift
	}

}
