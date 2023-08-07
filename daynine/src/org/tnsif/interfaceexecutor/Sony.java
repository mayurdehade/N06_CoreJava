package org.tnsif.interfaceexecutor;

public interface Sony {
	
	//By default all the variables inside an interface is public static final
	int noOfChannels = 8;

	//by default all the method inside an interface is an abstract method
	void display();
	
	//CORE JAVA 8 provides static and default method inside an interface
	//for calling use interface.method() 
	//This is non abstract method
	static void accept() {
		System.out.println("Static Method");
	}
	
	default void show() {
		System.out.println("Default Method");
	}
}
