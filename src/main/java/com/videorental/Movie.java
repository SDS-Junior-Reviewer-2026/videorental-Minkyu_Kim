package com.videorental;

public abstract class Movie {

	public static final int CHILDRENS = 2;
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;
	
	private String title;
	private int priceCode;

	public Movie(String title, int priceCode) {
		this.title = title;
		this.priceCode = priceCode;
	}

	public int getPriceCode() {
		return priceCode;
	}

	public void setPriceCode(int arg) {
		priceCode = arg;
	}

	public String getTitle() {
		return title;
	}

	abstract double getChargeFor(int daysRented);

	abstract int getFrequentRenterPointsFor(int daysRented);

	/*
	int getFrequentRenterPointsFor(int daysRented) {
		if ((getPriceCode() == NEW_RELEASE) && daysRented > 1) {
			return 2;
		}else {
			return 1;
		}
	} */
}