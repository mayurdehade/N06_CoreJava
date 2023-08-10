package org.tnsif.singledimensionalarray;

public class ArrayOfObjectDemo {

	public static void main(String[] args) {
		//here we are creating the array object of employees class
		Employees arr[] = new Employees[3];
		
		//storing the elements
		arr[0] = new Employees(101,"Mayur Dehade", 54120.22);
		arr[1] = new Employees(102,"Dipak Bhide", 1000000.23);
		arr[2] = new Employees(103, "Milind Ghegadmal", 7854222.54);
		
		//Printing the values 
		//here the values is assigned to the array of object and we can access that values
		//using the getters
		for(int i=0; i<3; i++) {
			System.out.println(arr[i].getID()+ " "+ arr[i].getName()+" "+arr[i].getSalary());
		}

	}

}
