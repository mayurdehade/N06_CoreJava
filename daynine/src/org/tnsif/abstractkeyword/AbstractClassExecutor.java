package org.tnsif.abstractkeyword;

public class AbstractClassExecutor {

	public static void main(String[] args) {
		//We can't create the object for abstract class
		//sandwich s = new Sandwich();
		
		CheeseCornSandwich c = new CheeseCornSandwich();
		
		c.prepare();
		c.showReceipe();
		c.prepare(1);

	}

}
