/*
 * There are n peoples standing in a circle waiting to be executed.
 * The counting out begins at some point in a circle and 
 * proceeds around the circle in a fix direction.
 * In each step a certain no of peoples are skipped and the next person is
 * executed. The elimination proceeds around the circle (which is becoming smaller
 * and smaller as they executed people are removed), until only the last person remains, who is given freedom?
 * Given the total no of person n and a number k which in the indicates k-1 person are skipped and kth person is killed in a circle.
 * The task is to choose the person in a initial circle that survives.
 * n=5, k=2
 */
package org.tnsif.dayfourchallenge;

import java.util.Scanner;

public class CircleSurviveChallenge {

	static int survive(int n, int k) {
		if(n==1) 
			return 1;
		else
			return (survive(n-1,k)+k-1)%n+1;
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the values of n and k: ");
		int n = s.nextInt();
		int k = s.nextInt();
		
		
		
		System.out.println("Ans is: "+survive(n,k));
	}
	
	

}
