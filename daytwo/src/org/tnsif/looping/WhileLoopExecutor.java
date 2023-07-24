package org.tnsif.looping;

import java.util.Scanner;

public class WhileLoopExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		int i=1;
		System.out.println("1 to N: ");
		while(i<=n) {
			System.out.print(i + " ");
			i++;
		}
		
		System.out.println("\nN to 1:");
		
		while(n>=1) {
			System.out.print(n + " ");
			n--;
		}
	}

}
