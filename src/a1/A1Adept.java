package a1;

import java.util.Arrays;
import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// creating one array for item names, index corresponds with another array with its price

		int numberItems = scan.nextInt();
		String[] itemNames = new String[numberItems];
		double[] itemPrices = new double[numberItems];

		for (int i=0; i<numberItems; i++) {
			itemNames[i] = scan.next();
			itemPrices[i] = scan.nextDouble();
		}

		int numberCustomers = scan.nextInt();

		// one array with customer names, one with total spent
		// goal is to fill total spent array with values
		// to do this, we loop through the string items bought and match them with itemName entry
		// when a match is found, we go to prices array and use corresponding index to add to total array

		String[] customerNames = new String[numberCustomers];
		double[] totalSpent = new double[numberCustomers];

		// this is the loop that loops through each customer
		for (int j=0; j<numberCustomers; j++) {
			customerNames[j] = scan.next() + " " + scan.next();
			int itemsBought = scan.nextInt();

			// this is the loop that loops through what each customer bought
			for (int k=0; k<itemsBought; k++) {
				int numberOfItem = scan.nextInt();
				String productBought = scan.next();

				// this is the loop that goes through itemNames[]
				for (int m=0; m<numberItems; m++)  {
					if (productBought.equals(itemNames[m])) {
						totalSpent[j] += itemPrices[m]*numberOfItem;
					}

				}

			}

		}

		// uses totalSpent array to print maximum
		double curMax = totalSpent[0];		
		String maxName = customerNames[0];

		for (int i=1; i < totalSpent.length; i++) {
			if (totalSpent[i] > curMax) {
				curMax = totalSpent[i];
				maxName = customerNames[i];
			}
		}

		System.out.println("Biggest: " + maxName + " (" + String.format("%.2f", curMax) + ")");

		// uses totalSpent array to print minimum 
		double curMin = totalSpent[0];		
		String minName = customerNames[0];

		for (int i=1; i < totalSpent.length; i++) {
			if (totalSpent[i] < curMin) {
				curMin = totalSpent[i];
				minName = customerNames[i];
			}
		}

		System.out.println("Smallest: " + minName + " (" + String.format("%.2f", curMin) + ")");

		// uses totalSpent array to print average
		double average = 0.00;

		for (int i=0; i<totalSpent.length; i++) {
			average += totalSpent[i];
		}

		average /= numberCustomers;

		System.out.println("Average: " + String.format("%.2f", average));

	}
}
