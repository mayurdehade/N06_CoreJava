package vivekfurniturestore;

import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Customer Name");
		String name = sc.nextLine();
		System.out.println("Enter Phone Number");
		long number = sc.nextLong();
		System.out.println("Enter address");
		sc.next();
		String address = sc.nextLine();
		CustomerDetails c1 = new CustomerDetails(name, number, address);
		
		System.out.println("Enter Bero Type");
		String type = sc.nextLine();
		
		Discount d = new Discount();
		
		if(type.equals("Wooden Bero")) {
			System.out.println("Enter Bero Colour");
			String color = sc.nextLine();
			System.out.println("Enter Wood Type");
			String wood = sc.nextLine();
			WoodenBero w = new WoodenBero(type, color, wood);
			w.calculatePrice();
			System.out.println("Amount needs to be paid "+(w.getPrice()-w.calculateDiscount(w)));
		}
		else if(type.equals("Steel Bero")) {
			System.out.println("Enter Bero Colour");
			String color = sc.nextLine();
			System.out.println("Enter Wood Height");
			int height = sc.nextInt();
			SteelBero s = new SteelBero(type, color, height);
			s.calculatePrice();
			System.out.println("Amount needs to be paid "+(s.getPrice()-s.calculateDiscount(s)));
		}
		else {
			System.out.println(type+" is an invalid bero type");
		}

	}

}
