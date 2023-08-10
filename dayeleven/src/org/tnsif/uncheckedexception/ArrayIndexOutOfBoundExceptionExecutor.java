//Program to demonstrate array index out of bound exception
package org.tnsif.uncheckedexception;

public class ArrayIndexOutOfBoundExceptionExecutor {

	static void display(int arr[]) {
		System.out.println(arr[3]);
	}
	
	public static void main(String[] args) {
		int arr[] = {45,7,88};
		try {
			display(arr);
		}
		catch(Exception e) {
			System.out.println("Exeption handled: "+e);
		}
		finally {
			System.out.println("Finally block is always executed");
		}
		System.out.println("Any statement out of the block is always executed");
	}

}
