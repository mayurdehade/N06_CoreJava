//Program to demonstrate class and object
package org.tnsif.classandobject;

//class declaration
public class Employee {

	//default data members -> This access inside the same package 
	int empID;
	String empName;
	float salary;
	String department;
	
	//method declaration and definition
	void display()
	{
		System.out.println("Emp ID: " + empID +" Emp Name: " + empName + " Salary: " + salary + " Department: " + department);
	}
	
	
}
