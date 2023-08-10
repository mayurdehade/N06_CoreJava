package org.tnsif.uncheckedexception;

import java.util.Scanner;

public class ThrowandThrowsKeywordDemo {

	//sometime we have to use throws keyword if we got error
	static void isEligible(int age, int weight) {
		if(age>18 && weight>50)
			System.out.println("Person is eligible to donate the blood");
		else 
			//throw keyword is used to throw an exception explicitly
			throw new ArithmeticException("Criteria is not satisfied");
	}
	public static void main(String[] args) {
		try {
			isEligible(13,54);			
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
