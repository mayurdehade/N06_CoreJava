//Program to demonstrate this keyword refer instance variable
//It can be used to refer instance variable of current class
package org.tnsif.thiskeyword;

public class ThisKeywordDemoOne {
	//Default variable
	int x, y;
	
	//set data method
	//we can change the variable name to avoid confusion instead of this keyword
	void setData(int x, int y)
	{
		//this keyword is used to avoid the confusion between
		//default variable and method's parameter.
		this.x=x; 
		this.y=y;
	}
	
	//method
	void display()
	{
		System.out.println(x+" "+y);
	}
	
	public static void main(String[] args) {
		ThisKeywordDemoOne t = new ThisKeywordDemoOne();
		t.setData(4, 5);
		t.display();
	}

}
