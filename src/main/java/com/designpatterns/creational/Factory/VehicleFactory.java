package com.designpatterns.creational.Factory;

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
