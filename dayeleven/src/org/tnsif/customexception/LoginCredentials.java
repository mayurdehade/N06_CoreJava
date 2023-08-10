//Program to demonstrate on custom exception
//to use custom exception extends an Exception class (parent)
package org.tnsif.customexception;

public class LoginCredentials extends Exception{
	private String str;
	
	//getters and setters
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	//parameterized constructor
	public LoginCredentials(String str) {
		super();
		this.str = str;
	}

	@Override
	public String toString() {
		return "LoginCredentials [str=" + str + "]";
	}
	
	
	
	
}
