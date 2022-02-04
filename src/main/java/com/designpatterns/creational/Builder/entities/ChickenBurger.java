package com.designpatterns.creational.Builder.entities;

public class ChickenBurger extends Burger{
    @Override
    public String getName() {
        return "Chicken Burger";
    }

    @Override
    public float getPrice() {
        return 2.5f;
    }
}
