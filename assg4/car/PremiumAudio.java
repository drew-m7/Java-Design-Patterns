package edu.isu.assg4.car;
/**
 * One of the decorator. 
 */

public class PremiumAudio extends CarDecorator {

    private double premiumAudioCost = 0.0;
    public PremiumAudio(Car rentalCar, double cost) {
        super(rentalCar);
        this.premiumAudioCost = cost;
    }

    public double getPrice(){
        addPremiumAudio();
		return rentalCar.getPrice();
	}

	private void addPremiumAudio(){
		this.rentalCar.addPrice(premiumAudioCost);
	}

	public String getDescription(){
		return "Adding Premium Audio cost of - $"+premiumAudioCost;
	}
    
}
