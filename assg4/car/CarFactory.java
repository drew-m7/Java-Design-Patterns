package edu.isu.assg4.car;

public class CarFactory {

    public enum CarType{
        EV, SPORTS
    }

    public static Car rentCar(CarType t){
        if ( t == CarType.EV)
            return new EV();
        else
            return new SportsCar();
    }

}
