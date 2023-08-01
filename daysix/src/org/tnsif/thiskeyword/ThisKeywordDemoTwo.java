//This keyword can be passed as argument in the constructor call
package org.tnsif.thiskeyword;

public class ThisKeywordDemoTwo {

	int x,y;
	
	//Parameterized constructor
	//We can change the variable name to avoid confusion instead of this keyword
	//or else we use the this keyword
	
	public ThisKeywordDemoTwo(int x, int y)
	{
		this.x=x; //this.datameter = parameter
		this.y=y;
	}
	
	public void display()
	{
		System.out.println(x+" "+y);
	}
	
	public static void main(String[] args) {
		ThisKeywordDemoTwo t = new ThisKeywordDemoTwo(5,6);
		t.display();

	}

}
