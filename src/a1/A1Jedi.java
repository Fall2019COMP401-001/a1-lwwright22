package a1;

import java.util.Scanner;
import java.util.Arrays;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// one array for items
		// one array for totals of that item purchased
		// we loop through the customers and match the product with the array for items
		// every time there's a match, use current items index to ++ in the totals array
		
		//making the item array and totals array
		int numberItems = scan.nextInt();
		String[] itemNames = new String[numberItems];
		int[] totals = new int[numberItems];
		int[] customerTotals = new int[numberItems];
		
		//unnecessary
		double[] itemPrices = new double[numberItems];
		
		//going through the data and indexing it
		for (int i=0; i<numberItems; i++) {
			itemNames[i] = scan.next();
			itemPrices[i] = scan.nextDouble();
		}
		
		int numberCustomers = scan.nextInt();
		
		//idk what to do with this
		String[] customerNames = new String[numberCustomers];
		
		//this is the loop that loops through each customer
		for (int j=0; j<numberCustomers; j++) {
			//unnecessary but idk what to do with it
			customerNames[j] = scan.next() + " " + scan.next();
			
			//total of the items bought by this customer
			int itemsBought = scan.nextInt();
			
			//this is the loop that loops through what each customer bought
			for (int k=0; k<itemsBought; k++) {
				int numberOfItem = scan.nextInt();
				String productBought = scan.next();
				boolean booleanProduct = false;
				int indexOfItem = 0;
				
				//this is the loop that goes through itemNames[]
				for (int m=0; m<numberItems; m++)  {
						if (productBought.equals(itemNames[m])) {
							totals[m] += numberOfItem;
							booleanProduct = true;
							indexOfItem = m;
						}
					
				}		
				
				if (booleanProduct == true) {
					customerTotals[indexOfItem]++;
				}
			
			}
	
		}	
				
		for(int h=0; h<totals.length; h++) {
			if(totals[h]==0) {
				System.out.println("No customers bought " + itemNames[h]);
			} else {
				System.out.println(customerTotals[h] + " customers bought " + totals[h] + " " + itemNames[h]);
			}
		}
		
	}
}
