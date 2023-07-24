//Program to demonstrate on Cascaded if...else statement
package org.tnsif.decisonmaking;

import java.util.Scanner;

public class CascadedIfElseExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the age of person: ");
		int age1 = sc.nextInt();
		int age2 = sc.nextInt();
		int age3 = sc.nextInt();
		
		if(age1>age2 && age1>age3) {
			System.out.println("Age1 is greater: " + age1);
		}
		else if(age2>age1 && age2>age3) {
			System.out.println("Age2 is greater: "+age2);
		}
		else {
			System.out.println("Age3 is greater: "+age3);
		}

	}

}
