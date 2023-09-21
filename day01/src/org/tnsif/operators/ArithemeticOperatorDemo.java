//Program to demonstrate on Arithmetic Operators

package org.tnsif.operators;
import java.util.*;

public class ArithemeticOperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println("Addition: "+ (num1+num2));
		System.out.println("Substraction: " + (num1-num2));
		System.out.println("Multiplication: "+ (num1*num2));
		System.out.println("Division: "+ (num1/num2));
		System.out.println("Modulus: "+(num1%num2));
		
	}

}
