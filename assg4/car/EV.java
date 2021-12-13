package edu.isu.assg4.car;

/**
 * EV, an implementation of the Car. 
 */
public class EV implements Car {

    private double rentalPrince = 50.0;
    @Override
    public double getPrice() {
        return rentalPrince;
    }

    @Override
    public void addPrice(double d) {
        rentalPrince +=d;
    }

    @Override
    public String getDescription() {
        return "You are renting a base EV car @ $50/hr";
    }
    
}
