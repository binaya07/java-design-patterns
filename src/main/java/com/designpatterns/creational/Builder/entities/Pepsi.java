package com.designpatterns.creational.Builder.entities;

public class Pepsi extends ColdDrink {
    @Override
    public String getName() {
        return "Pepsi";
    }

    @Override
    public float getPrice() {
        return 0.5f;
    }
}
