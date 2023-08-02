//Program to demonstrate super keyword with constructor
package org.tnsif.superkeyword;

//parent class
class Google
{
	String ceo;

	public Google(String ceo) {
		System.out.println("Default Constructor: "+ceo);
	}
	
	
}

//child class
class GoogleMap extends Google
{
	String userid;

	public GoogleMap(String ceo, String userid) {
		//calling to parent class parameterized constructor
		//here the ceo is passing to the parent class constructor
		super(ceo);
		this.userid = userid;
		System.out.println(userid);
	}
	
}

public class SuperKeywordWithConstructor {

	public static void main(String[] args) {
		
		GoogleMap g = new GoogleMap("Sundar Pichai", "mayur@gmail.com");

	}

}
