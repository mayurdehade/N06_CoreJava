//Program to demonstrate the Relation Operator
package org.tnsif.operators;
import java.util.Scanner;

public class RelationalOperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two numbers: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println(num1 < num2);
		System.out.println(num1 > num2);
		System.out.println(num1 == num2);
		System.out.println(num1 != num2);
		System.out.println(num1 >= num2);
		System.out.println(num1 <= num2);
		
	}

}
