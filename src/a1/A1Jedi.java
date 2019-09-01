package a1;

import java.util.Scanner;
import java.util.Arrays;

public class A1Jedi {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// making array of all items, array with total of item sold, and total customers who bought item
		int numberItems = scan.nextInt();
		String[] itemNames = new String[numberItems];
		int[] totals = new int[numberItems];
		int[] customerTotals = new int[numberItems];

		// filling items array
		for (int i=0; i<numberItems; i++) {
			itemNames[i] = scan.next();
			scan.nextDouble();
		}

		int numberCustomers = scan.nextInt();

		// this is the loop that loops through each customer
		for (int j=0; j<numberCustomers; j++) {
			scan.next();
			scan.next();

			// total of the items bought by this customer so we know how many times to loop
			int itemsBought = scan.nextInt();
			// boolean logic to prevent totalCustomers from being ticked twice for the same customer
			boolean[] boughtYet = new boolean[numberItems];

			// loops through what each customer bought
			for (int k=0; k<itemsBought; k++) {
				int numberOfItem = scan.nextInt();
				String productBought = scan.next();
				int indexOfItem = 0;

				// goes through itemNames[] to find matches so we can tick totals array and customerTotals array
				for (int m=0; m<numberItems; m++)  {
					if (productBought.equals(itemNames[m])) {
						totals[m] += numberOfItem;
						indexOfItem = m;		
						if (boughtYet[m] == false) {
							customerTotals[indexOfItem]++;
						}
						boughtYet[m] = true;
					}
				}	

			}

		}	
		
		// prints results

		for(int h=0; h<totals.length; h++) {
			if(totals[h]==0) {
				System.out.println("No customers bought " + itemNames[h]);
			} else {
				System.out.println(customerTotals[h] + " customers bought " + totals[h] + " " + itemNames[h]);
			}
		}

	}
}
