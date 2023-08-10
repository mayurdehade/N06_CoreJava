//Program to demonstrate the multiple catch block
package org.tnsif.uncheckedexception;

public class CatchBlockDemo {
	
	static void print(int arr[]) {
		try {
			System.out.println(arr[3]);
		}
		//we can use multiple catch block in program
		catch(ArrayIndexOutOfBoundsException | NullPointerException e) { //using pipe operator
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println("Exception handled: "+e);
		}
	}

	public static void main(String[] args) {
		
		int arr[] = {15,4,8};
		
		print(arr);
	}

}
