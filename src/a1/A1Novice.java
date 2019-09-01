package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		//establishing how many times the loop should run/how many customers to loop through
		int numberOfCustomers = scan.nextInt();
		
		//storing these as variables that will be printed at the end
		String firstName = "";
		String lastName = "";
		
		//this establishes how many times to loop per customer
		int productsBought = 0;
		double total = 0.00;

		//this loop is on customer level
		for (int i=0; i<numberOfCustomers; i++) {

			firstName = scan.next();
			lastName = scan.next();
			productsBought = scan.nextInt();

			//this loop is on individual customer level, loops through products
			//adds to total money spent for this customer
			for (int j=0; j<productsBought; j++) {
				int count = scan.nextInt();
				String productName = scan.next();
				double price = scan.nextDouble();
				total += count * price;
			}
			
			//prints this customer's information

			String printTotal = String.format("%.2f", total);

			System.out.println(firstName.charAt(0) + ". " + lastName + ": " + printTotal);
			total = 0.00;

		}

	}

}