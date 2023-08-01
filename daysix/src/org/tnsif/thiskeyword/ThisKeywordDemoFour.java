package org.tnsif.thiskeyword;

public class ThisKeywordDemoFour {
	
	int x;
	
	//default constructor
	ThisKeywordDemoFour(){
		//calling to parameterized constructor using this keyword with arguments 10
		//then parameterized constructor is executed first and then default constructor is executed
		this(10);
		
		System.out.println("This is default constructor");
	}
	
	ThisKeywordDemoFour(int x){
		this.x=x;
		System.out.println("This is parameterized constructor: "+x);
	}

	public static void main(String[] args) {
		ThisKeywordDemoFour t = new ThisKeywordDemoFour(); //calling to default constructor

	}

}
