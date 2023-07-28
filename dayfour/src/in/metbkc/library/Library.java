//Program to demonstrate different access specifiers
package in.metbkc.library;

public class Library {
	
	//Different Access Specifiers/Modifiers
	public String libraryName;
	private long userID;
	String booksName;
	
	
	//public method
	public void displayPublic()
	{
		System.out.println("Library Name: "+libraryName);
	}
	
	//private method
	@SuppressWarnings("unused")
	private void displayPrivate()
	{
		System.out.println("User ID: "+userID);
	}
	
	//Default Method
	void displayDefault()
	{
		System.out.println("Book Name: "+booksName);
	}

}
