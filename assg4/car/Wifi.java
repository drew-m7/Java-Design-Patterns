package edu.isu.assg4.car;

/**
 * One of the decorator. 
 */
public class Wifi extends CarDecorator {

    private double localWifiCost = 0.0;
    public Wifi(Car rentalCar, double cost) {
        super(rentalCar);
        this.localWifiCost = cost;
    }

    public double getPrice(){
        addWifi();
		return rentalCar.getPrice();
	}

	private void addWifi(){
		this.rentalCar.addPrice(localWifiCost);
	}

	public String getDescription(){
		return "Adding Wifi cost of - $"+localWifiCost;
	}
    
}
