package a1;

import java.util.Arrays;
import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		//one array for item names, index corresponds with another array with its price
		// for loop is just creating that array
		
		int numberItems = scan.nextInt();
		String[] itemNames = new String[numberItems];
		double[] itemPrices = new double[numberItems];
		
		for (int i=0; i<numberItems; i++) {
			itemNames[i] = scan.next();
			itemPrices[i] = scan.nextDouble();
		}
		
		int numberCustomers = scan.nextInt();
		
		//new array with customer names
		// diff new array with the total of what they bought
			// to do this, new loop that goes through the items bought
			// string equals with the itemName`s array
			// when it finds a match, then it goes to the prices array and finds matching price using index
			// then adds that price to the total
		
		String[] customerNames = new String[numberCustomers];
		double[] totalSpent = new double[numberCustomers];
		
		//this is the loop that loops through each customer
		for (int j=0; j<numberCustomers; j++) {
			customerNames[j] = scan.next() + " " + scan.next();
			int itemsBought = scan.nextInt();
			
			//this is the loop that loops through what each customer bought
			for (int k=0; k<itemsBought; k++) {
				int numberOfItem = scan.nextInt();
				String productBought = scan.next();
				
				//this is the loop that goes through itemNames[]
				for (int m=0; m<numberItems; m++)  {
						if (productBought.equals(itemNames[m])) {
							totalSpent[j] += itemPrices[m]*numberOfItem;
						}
					
				}
			
			}
	
		}

	
	// then make methods that loop through the total spent array to find max, min, and avg
		
		//print the maximum
		double curMax = totalSpent[0];		
		String maxName = customerNames[0];
		
		for (int i=1; i < totalSpent.length; i++) {
			if (totalSpent[i] > curMax) {
				curMax = totalSpent[i];
				maxName = customerNames[i];
			}
		}
		
		System.out.println("Biggest: " + maxName + " (" + String.format("%.2f", curMax) + ")");

		//print the minimum
		
		double curMin = totalSpent[0];		
		String minName = customerNames[0];
		
		for (int i=1; i < totalSpent.length; i++) {
			if (totalSpent[i] < curMin) {
				curMin = totalSpent[i];
				minName = customerNames[i];
			}
		}
		
		System.out.println("Smallest: " + minName + " (" + String.format("%.2f", curMin) + ")");

		//print the average
		
		double average = 0.00;
		
		for (int i=0; i<totalSpent.length; i++) {
			average += totalSpent[i];
		}
		
		average /= numberCustomers;
		
		System.out.println("Average: " + String.format("%.2f", average));
					
}
}
