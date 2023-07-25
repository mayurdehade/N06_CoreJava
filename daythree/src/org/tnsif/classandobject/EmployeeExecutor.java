//driver class
//Program to demonstrate class and object

package org.tnsif.classandobject;

public class EmployeeExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Object Creation
		Employee e = new Employee();
		
		e.empID = 132981;
		e.empName = "Milind Ghegadmal";
		e.salary = 178000;
		e.department = "IT";
		
		//method call
		e.display();
		
	}

}
