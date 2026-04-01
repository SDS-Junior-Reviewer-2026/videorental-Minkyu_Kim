package com.videorental;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Customer {
	private String name;
	private List<Rental> rentals = new ArrayList<>();

	public Customer(String name) {
		this.name = name;
	}

	public void addRental(Rental rental) {
		rentals.add(rental);
	}

	public String getName() {
		return name;
	}

	public String statement() {
		int frequentRenterPoints = 0;
		Iterator<Rental> iterator = rentals.iterator();
		String result = "Rental Record for " + getName() + "\n";

		while ( iterator.hasNext() ) {
			Rental each = (Rental) iterator.next();
			// determine amounts for each line

			//double thisAmount = each.getCharge();

			// add frequent renter points
			frequentRenterPoints++;
			// add bonus for a two day new release rental
			if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) && each.getDaysRented() > 1)
				frequentRenterPoints++;
			// show figures
			result += "\t" +  String.valueOf(each.getCharge()) + "(" + each.getMovie().getTitle() + ")" + "\n";
		}

		result += "Amount owed is " + getTotalAmount() + "\n";
		result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter pointers";

		return result;
	}

	private double getTotalAmount() {
		double totalAmount = 0;
		for(Rental rental : rentals) {
			totalAmount += rental.getCharge();
		}
		return totalAmount;
	}
}