package org.tnsif.threads;

public class ThreadDemo {

	public static void main(String[] args) {
		System.out.println("In main "+ Thread.currentThread());
		System.out.println("Factorial of 4 = " + Operators.getFactorial(4));
//		System.out.println("Factorial of 4 "+Thread.currentThread());
		System.out.println("Is 50 is  Prime number? "+ Operators.isPrime(50));

		System.out.println("---------------------");
		Thread t = Thread.currentThread();
		System.out.println(t.getName());
		System.out.println(t);
		
	}

}
