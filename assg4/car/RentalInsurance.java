package edu.isu.assg4.car;
/**
 * One of the decorator. 
 */

public class RentalInsurance extends CarDecorator {

    private double insuracneCost = 0.0;
    public RentalInsurance(Car rentalCar, double cost) {
        super(rentalCar);
        this.insuracneCost = cost;
    }

    public double getPrice(){
        addInsuranceCost();
		return rentalCar.getPrice();
	}

	private void addInsuranceCost(){
		this.rentalCar.addPrice(insuracneCost);
	}

	public String getDescription(){
		return "Adding insurance cost of - $"+insuracneCost;
	}
    
}
