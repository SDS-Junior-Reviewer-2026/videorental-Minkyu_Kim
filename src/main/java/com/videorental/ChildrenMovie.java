package com.videorental;
public class ChildrenMovie extends Movie {
    public ChildrenMovie(String title) {
        super(title, Movie.CHILDRENS);
    }

    @Override
    double getChargeFor(int daysRented) {
        double thisAmount = 0;
        thisAmount += 1.5;
        if (daysRented > 3)
            thisAmount += (daysRented - 3) * 1.5;
        return thisAmount;
    }

    @Override
    int getFrequentRenterPointsFor(int daysRented) {
        return 1;
    }
}