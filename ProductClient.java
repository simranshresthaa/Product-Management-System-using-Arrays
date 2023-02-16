package com.pms.client;

import java.util.Scanner;

import com.pms.details.ProductDetails;

public class ProductClient {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		while(true) {
			
		
	System.out.println("-------------------------------");
	System.out.println("1)Product");
	System.out.println("2)Exit ");
	System.out.println("-------------------------------");
	System.out.println("Enter the choice");
	int choice = key.nextInt();
	switch(choice) {
	case 1:
		ProductDetails details = new ProductDetails();
		System.out.println("Enter Username");
		String uname = key.next();
		System.out.println("Enter password");
		String pass = key.next();
		if(uname.equals("Admin")&& pass.equals("Admin@123"))
			
		details.productMenu();
		else
			System.out.println("Invalid User");
		break;
	case 2:
		System.out.println(" Thank you for using the app.");
		System.exit(0);
	default:
		System.out.println("Choose between ");
	}
		}

}
}