//check exception is compile time
package org.tnsif.checkexception;

import java.io.FileInputStream;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		try {
			FileInputStream f = new FileInputStream("C:\\Users\\Mayur\\Downloads\\input1.txt");
			System.out.println("File is exists!");
		}
		catch(Exception e) {
			System.out.println("Exception Handled: "+ e);
		}

	}

}
