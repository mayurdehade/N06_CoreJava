//Printing the patter using for loop
package org.tnsif.looping;

import java.util.Scanner;

public class PrintPatterHomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		
		//Print the number of digit using do...while
		System.out.println("Enter digit: ");
		long number = sc.nextLong();
		
		int count=0;
		do {
			number/=10;
			count++;
		}while(number>0);
		
		System.out.println("The digit of the number is: "+count);
	}

}
