package com.designpatterns.creational.Factory;

public class Bike implements Vehicle{
    @Override
    public String drive() {
        return "Bike is driving now .. Vroom Vroom";
    }
}
