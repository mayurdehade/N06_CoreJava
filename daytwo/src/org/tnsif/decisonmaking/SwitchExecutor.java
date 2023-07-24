//Program to demonstrate on switch statement
package org.tnsif.decisonmaking;

import java.util.Scanner;

public class SwitchExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your choice: ");
		int songno = sc.nextInt();
		
		switch(songno) 
		{
			case 1: 
				System.out.println("Waka Waka");
				break;
			case 2:
				System.out.println("Perfect");
				break;
			case 3:
				System.out.println("Apna Bana le");
				break;
			case 4: 
				System.out.println("Lag Ja Gale");
				break;
			default: 
				System.out.println("You enter wrong message");
		}
		
		sc.close();
	}

}
