package com.olukotun.shoppingCart.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import com.olukotun.shoppingCart.creditCard.CreditCard;
import com.olukotun.shoppingCart.item.Items;

public class CartService {
	Scanner scanner = new Scanner(System.in);
	List<Items> items = new ArrayList<Items>();
	double amount = 0;
	double sum = 0;

	public List<Items> addToCart() {

		while (true) {

			System.out.println("Enter the name of the item");

			String name = scanner.next();

			System.out.println("Enter the price of the item");
			double price = scanner.nextDouble();

			System.out.println("Please enter the quantity");
			int quantity = scanner.nextInt();
			Items item = new Items(name, price, quantity);

			items.add(item);

			System.out.println("Do you have more items to scan?");

			String responseString = scanner.next();

			if (responseString.equalsIgnoreCase("No")) {
				break;
			}

		}
		return items;

	}

	public void checkOut(List<Items> items) {

		
		for (Items item : items) {

			int qunatity = item.getQuantity();
			double price = item.getPrice();
			double totalCost = qunatity * price;
			sum = sum + totalCost;

		}
		System.out.println("Amount due " + "$" + sum + " insert card to complete your transaction");

		System.out.println("Do you want to continue with payment?");
		String response = scanner.next();
		if (response.equalsIgnoreCase("yes")) {
			System.out.println("Please enter the card number");
			String cardNo = scanner.next();
			System.out.println("please enter the cvc");
			int cvc = scanner.nextInt();
			pay(cardNo, cvc);

		} else if (response.equalsIgnoreCase("no")) {
			System.out.println("Do you wish to delete an item? ");
			response = scanner.next();
			if (response.equalsIgnoreCase("yes")) {
				removeItem();
				
				System.out.println("Do you want to continue with payment?");
				response = scanner.next();
				if(response.equalsIgnoreCase("yes")) {
					System.out.println("Please enter the card number");
					String cardNo = scanner.next();
					System.out.println("please enter the cvc");
					int cvc = scanner.nextInt();
					pay(cardNo, cvc);
				}

			}
		}

	}

	public void removeItem() {

		System.out.println("Please enter the name of the item to remove");
		String name = scanner.next();
		System.out.println("Please enter the quantity of the item: ");
		int quantity = scanner.nextInt();
		double PriceToRemove = 0;
		
		for (Items item : items) {
			if (item.getName().equalsIgnoreCase(name)) {
			
				items.remove(item);
				item.setQuantity(quantity);
				double price = item.getPrice();
				PriceToRemove = item.getQuantity() * price;

				sum -= PriceToRemove;

			}

		}
		System.out.println(name + " removed, " + "$" + PriceToRemove + " was removed from your total balance " + sum);
	}

	public void loadCard(double amount) {

		amount = 0;
		while (amount < sum) {
			System.out.println("Please load your credit card");
			Scanner scanner = new Scanner(System.in);

			System.out.println("Please enter the amount you want to laod");
			double counter = scanner.nextDouble();

			amount += counter;

		}

		System.out.println("You have succesfully load your card ");
		System.out.println("Try making the payment again");

		System.out.println("Please enter the card number");
		String cardNo = scanner.next();
		System.out.println("please enter the cvc");
		int cvc = scanner.nextInt();
		pay(cardNo, cvc);

	}

	public void pay(String cardNo, int cvc) {
		CreditCard creditCard = new CreditCard();

		creditCard.setCardNo(cardNo);
		// creditCard.setExpirationDate(expirationDate);
		creditCard.setCvc(cvc);

		amount = creditCard.getAmount();

		if (creditCard.getCardNo().startsWith("4")) {
			System.out.println("You used a Visa card to make this payment");

		} else {
			System.out.println();
		}
		System.out.println("***********************Customer's copy of Receipt*****************************");
		for (Items item : items) {
			System.out.println("Item name: " + item.getName() + " " + "item price:"
					+ item.getPrice() * item.getQuantity());
		}
		System.out.println("Transaction succesful you just made a payment of : " + sum);
		 System.out.println("Thank you for shopping at xyz");
		 System.out.println("Sign here_____________");

	}
}
