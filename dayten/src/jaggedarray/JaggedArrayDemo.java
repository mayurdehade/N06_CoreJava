package jaggedarray;
//Program to demonstrate the jagged array
//Jagged array is a array in which the first index is fixed and second index value (subarray index) is not fix

import java.util.Scanner;

public class JaggedArrayDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//declaring of a jagged array
		int arr[][] = new int [3][];
		arr[0] = new int [2];
		arr[1] = new int [3];
		arr[2] = new int [4];
		
		for(int i=0; i<3; i++) {
			System.out.println("Enter the "+arr[i].length+" element: ");
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
