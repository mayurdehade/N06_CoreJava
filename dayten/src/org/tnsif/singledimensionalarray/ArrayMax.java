//Program to demonstrate the 1D array using run-time input values and to find largest element in an array
package org.tnsif.singledimensionalarray;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the the total no of array element: ");
		int n = sc.nextInt();
		int arr1[] = new int[n];
		System.out.println("Enter the element of array: ");
		for(int i=0; i<n; i++) {
			arr1[i] = sc.nextInt();
		}
		
		//printing the array
		System.out.println("Array elements are: ");
		for(int i:arr1) {
			System.out.print(i+" ");
		}
		
		int max = arr1[0];
		for(int i=0; i<n; i++) {
			if(arr1[i]>max)
				max = arr1[i];
		}
		
		System.out.println("\nMaximum element is: "+max);
		
		Arrays.sort(arr1);
		System.out.println("Sorted elements are: ");
		for(int i:arr1) {
			System.out.print(i+" ");
		}
		

	}

}
