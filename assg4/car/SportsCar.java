package edu.isu.assg4.car;
/**
 * SportsCar, an implementation of the Car. 
 */

public class SportsCar implements Car {

    private double rentalPrince = 30.0;
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
         return "You are renting a base Sports car @ $30/hr";
    }
    
}
