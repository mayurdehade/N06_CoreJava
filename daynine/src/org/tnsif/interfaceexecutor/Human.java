//Program to demonstrate the multiple inheritance
package org.tnsif.interfaceexecutor;

public class Human implements ColdDrink, AlcoholDrinks {

	@Override
	public void showDrink() {
		
		System.out.println(colddrinkName + " "+alcoholType + " " + brand);
		System.out.println(colddrinkName);
	}

	
	
}
