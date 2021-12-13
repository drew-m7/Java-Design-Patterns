package edu.isu.assg4.car;

// Car Decorator
/**
 * The decorator that adds additional functionality to the base car (EV or SportsCar).  
 */
public abstract class CarDecorator implements Car {

	protected Car rentalCar;

	public CarDecorator(Car rentalCar) {
		this.rentalCar = rentalCar;
	}

	public double getPrice(){
		return rentalCar.getPrice();
	}

	public void addPrice(double d){
		rentalCar.addPrice(d);
	}

	public String getDescription(){
		return rentalCar.getDescription();
	}


}
