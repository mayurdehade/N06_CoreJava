package org.tnsif.threads;

public class ChildThreadTwo extends Thread {
	public void run() {
		System.out.println(" is 5 Prime number? "+Operators.isPrime(5));
	}
}
