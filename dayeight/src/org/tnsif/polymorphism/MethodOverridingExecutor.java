//Program to demonstrate the method overriding
//method overriding is a declaring the same method with same parameters in different class (Parent and Child)
//run-time polymorphism (dynamic or late binding)
//Use inheritance for overriding method
package org.tnsif.polymorphism;

//parent class
class ChiefMinister{
	//Override method (same parameter)
	static void corruption(String str1, float amount1) {
		System.out.println(str1+" corrupted the amount of "+amount1);
	}
}

//child class
class MLA2 extends ChiefMinister{
	//Override method (same parameter)
	static void corruption(String str1, float amount2) {
		//calling to the method of the parent class
//		ChiefMinister.corruption("Dipak Bhide", 540215.00f);
		System.out.println(str1+" corrupted the amount of "+amount2);
	}
}

public class MethodOverridingExecutor {

	public static void main(String[] args) {
		
		//calling to the method of the child class
		MLA2.corruption("Milind Ghegadmal", 100000.23f);
		//calling to the method of the parent class
		ChiefMinister.corruption("Dipak Bhide", 540215.00f);
		
		MLA2 m = new MLA2();
		m.corruption("Suraj", 54124.01f);
		

	}

}
