/*
 * Mary is good in mathematics. She is always playful and has a good memory. 
 * When her friend Pinky tells n numbers, she has a habit of telling all 
 * those numbers in the reverse order of what she told. Please help her 
 * friend to find if the order in which Mary says are correct or not.
 */
package practiceproblems;

import java.util.Scanner;

public class ReverseNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		
		int pinky[] = new int[n];
		int mary[] = new int[n];
		
		//input from user
		System.out.println("Number said by Pinky: ");
		for(int i=0; i<n; i++) {
			pinky[i] = sc.nextInt();
		}
		
		System.out.println("Number said my Mary: ");
		for(int i=0; i<n; i++) {
			mary[i] = sc.nextInt();
		}
		
		//check the reverse order
		isReverse(pinky, mary);
	}

	
	static void isReverse(int[] pinky, int[] mary) {
		int n = pinky.length;
		boolean match = true;
		//check the order
		for(int i=0; i<n; i++) {
			if(pinky[i] != mary[n-1-i]) {
				match = false;
				break;
			}
		}
		
		if(match) {
			System.out.println("Yes, it is in reverse order");
		} 
		else {
			System.out.println("No, it is not in reverse order");
		}
	}

}
