//Program to demonstrate on access specifier
//Driver Class
package in.kkw.library;

//import package
import in.metbkc.library.Library;
//import in.metbkc.library.*;

public class FacultyExecutor {

	public static void main(String[] args) {
		
		Library l = new Library();
		
		//Public: Access anywhere
		l.libraryName = "MET Bhujbal Knowledge City Library";
		l.displayPublic();
		
		/*
		 * UserID and displayPrivate() method is private so we can't 
		 * access into another package or class,
		 * only we can access insight the same class
		 */
//		l.userID = 12323; 
//		l.displayPrivate();
		
		
		/*
		 * booksName and displayDefault() method is default, 
		 * we can't access into another package, only
		 * we can access it within the same package
		 */
//		l.booksName = "Data Science";
//		l.displayDefault();
		
	}

}
