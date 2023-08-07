package org.tnsif.interfaceexecutor;

public class InterfaceExecutor {

	public static void main(String[] args) {
	
		//we can't instantiate an interface
		//Sony s1 = new Sony();
		SonyTV s = new SonyTV();
		
		s.display();
		s.show();
		Sony.accept();
		
		ISRO i = new ISRO();
		i.status();
		ChandrayaanThree.show();
		
		Human h = new Human();
		h.showDrink();

	}

}
