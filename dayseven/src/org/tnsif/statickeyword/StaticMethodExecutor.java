//Program to demonstrate the static method
package org.tnsif.statickeyword;

public class StaticMethodExecutor {
	
	String str="BKC";
	static float percentage = 78.9f;
	
	//static method
	/* If any method outside the main function and if you want to access that
	 * method inside the main function without creating object then make it as static.
	 */
	static void displayScore(int score)
	{
		System.out.println("Score is: "+score);
		System.out.println(percentage);
		/* We can't use non-static variable inside the static method */
//		System.out.println(str); //error
	}

	public static void main(String[] args) {
		
		displayScore(542);
		
	}

}
