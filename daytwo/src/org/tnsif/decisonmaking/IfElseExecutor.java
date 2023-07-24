//Program to demonstrate on to check the person is eligible to donate the blood or not using if...else
package org.tnsif.decisonmaking;

import java.util.Scanner;

public class IfElseExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age: ");
		int age = sc.nextInt();
		System.out.println("Enter the weight: ");
		int weight = sc.nextInt();
		
		if(age>=18 && weight>=50) 
		{
			System.out.println("You are eligible to donate the blood");
		}
		else 
		{
			System.out.println("You are not eligible to donate the blood");
		}
		
		sc.close();
	}

}
