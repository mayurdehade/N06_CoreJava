//Driver Class
//Program to demonstrate on default and parameterized constructors

package org.tnsif.classandobject;

public class LibraryExecutor {

	public static void main(String[] args) {

		//calling default constructor
		Library l = new Library();
		
		//parameterize constructor
		Library l1 = new Library(23, "Vishal Lichade", "Java Programming", 230.44);
		
		
		System.out.println(l1.toString());
		
	}

}
