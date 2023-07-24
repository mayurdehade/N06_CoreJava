//Program to demonstrate on bunjee jumping using nested if
package org.tnsif.decisonmaking;

import java.util.Scanner;

public class NestedIfExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age and weight: ");
		int age = sc.nextInt();
		int weight = sc.nextInt();
		
		if(age>=12) 
		{
			if(weight>=40) 
			{
				System.out.println("Eligible for bunjee jumping");
				if(weight>110) 
				{
					System.out.println("Extra ropes will be added");
				}
			}
			else
			{
				System.out.println("Not Eligible! Your weight is less than 40");
			}
		} 
		else 
		{
			System.out.println("Not Eligible! Your age is less than 12 years");
		}
		
		
	}

}
