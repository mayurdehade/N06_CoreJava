package org.tnsif.threads;

public class ChildThreadOne extends Thread {
	public void run() {
		System.out.println("Factorial of 5 is "+Operators.getFactorial(5));
	}
}
