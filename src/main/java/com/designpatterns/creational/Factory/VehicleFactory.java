package com.designpatterns.creational.Factory;

/**
 * Factory Design Pattern
 *
 * 1. Create a factory method in an interface.
 * 2. Implement the factory methods in subclasses.
 * 3. Depending on the argument, instantiate appropriate subclasses.
 */
public class VehicleFactory {

    public static Vehicle getVehicle(VehicleType vehicleType) {
        Vehicle vehicle;
        switch (vehicleType) {
            case CAR:
                vehicle = new Car();
                break;
            case BIKE:
                vehicle = new Bike();
                break;
            default:
                throw new IllegalArgumentException("Car and bike only supported.");
        }
        return vehicle;
    }
}
