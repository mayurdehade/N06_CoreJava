package org.tnsif.uncheckedexception;

public class FinallyBlockNotExecutedExecutor {

	static void display(int arr[]) {
		try {
			System.out.println(arr[2]);
			//1.if try and catch block contains a System.exit(0);
			//after the exception code line, then finally block does
			//not execute (when exception is occur then the System.exit(0) execute, otherwise it don't execute it) 
//			System.exit(0);
		}
		catch(Exception e) {
			System.out.println("Exeption handled: "+e);
			//When the exception is catch then only below line is executed
			System.exit(0);
		}
		finally {
			//When finally block contains an exception code, then finally block does not executed
			System.out.println(13/0);
			System.out.println("Finally block is always executed");
		}
		System.out.println("Any statement out of the block is always executed");
		
	}
	
	public static void main(String[] args) {
		int arr[] = {45,7,88};
			display(arr);
		
	}

}
