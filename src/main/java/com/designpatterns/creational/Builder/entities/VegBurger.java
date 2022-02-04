package com.designpatterns.creational.Builder.entities;

public class VegBurger extends Burger {
    @Override
    public String getName() {
        return "Veg Burger";
    }

    @Override
    public float getPrice() {
        return 1.5f;
    }
}
