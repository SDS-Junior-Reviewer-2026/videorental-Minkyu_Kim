package com.videorental;
public class RegularMovie extends Movie {
    public RegularMovie(String title) {
        super(title, Movie.REGULAR);
    }
    @Override
    double getChargeFor(int daysRented) {
        double thisAmount = 2;
        if (daysRented > 2)
            thisAmount += (daysRented - 2) * 1.5;
        return thisAmount;
    }

    @Override
    int getFrequentRenterPointsFor(int daysRented) {
        return 1;
    }
}