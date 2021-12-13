package edu.isu.assg4.car;

import edu.isu.assg4.car.CarFactory.CarType;

public class Client {

	public static void main(String args[]) {

		Car c = CarFactory.rentCar(CarType.EV);
		System.out.println(c.getDescription());

		CarDecorator addOn = new Wifi(c, 10);		
		System.out.println(addOn.getDescription());
		System.out.println("Rental Cost -" + addOn.getPrice());

		addOn = new RentalInsurance(c, 10);		
		System.out.println(addOn.getDescription());
		System.out.println("Rental Cost -" + addOn.getPrice());
	}
}
