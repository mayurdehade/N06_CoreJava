//Program to demonstrate on Ternary Operator
package org.tnsif.operators;

import java.util.Scanner;

public class TernaryOpratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		
		String result = (num%2==0)?"Even":"Odd";
		
		System.out.println("Number is: "+result);
		sc.close();
	}

}
