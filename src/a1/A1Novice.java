package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		 int numberOfCustomers = scan.nextInt();
		 String firstName = "";
		 String lastName = "";
		 int productsBought = 0;
		 double total = 0.00;
		//get first name and last name as strings
			// get number products bought and make that a new for loop
			// get count 
			// get name of product
			// get price
			// multiply the things to a total
			// get out of the inner for loop and print statement
		 
		 for (int i=0; i<numberOfCustomers; i++) {
			
			 firstName = scan.next();
			 lastName = scan.next();
			 productsBought = scan.nextInt();
			 
			 for (int j=0; j<productsBought; j++) {
				 int count = scan.nextInt();
				 String productName = scan.next();
				 double price = scan.nextDouble();
				 total += count * price;
			 }
			 
			 System.out.println(firstName.charAt(0) + ". " + lastName + ": " + total);
			 total = 0.00;
			 
		 }
		 
		 
		
		
	}
	
	// public static Customer createnewclass() {		
		// String firstname = scan.next();
		// String lastname = scan.next();
		// int productsbought = scan.nextInt();
		
		// for (int j=0; j<products.bought; j++) {
			
		// }
		
	// }
		
}