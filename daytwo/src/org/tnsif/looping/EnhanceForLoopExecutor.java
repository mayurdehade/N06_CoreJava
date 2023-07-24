//Program to demonstrate Enhanced for loop
package org.tnsif.looping;

public class EnhanceForLoopExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Enhance For loop: used for typecast values or iterate the element array
		 * 
		 * Syntax: 
		 * char arr[] = {'a','b','c'};
		 * for(char i:arr){
		 * 	System.out.println(i);
		 * }
		 */
		

		char a[] = {'m','a','y','u','r'};
		for(int i:a) { //here is type casting is performing char array is convert in int value by ASCII values
			System.out.print(i + " ");
		}
	}

}
