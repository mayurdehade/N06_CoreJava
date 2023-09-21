package org.tnsif.intro;
import java.util.Scanner;

public class UserInputDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Program to demonstrate on user input value
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str1 = sc.next();
		//nextLine() get the whole sentence
		System.out.println("You Entered String is: " + str1);
				
		//for reading the char
		System.out.println("Enter a character: ");
		char c = sc.next().charAt(0);
		        
		System.out.println("You Entered Char is: "+c);
	}

}
