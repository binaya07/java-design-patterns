package com.designpatterns.creational.Builder.entities;

public class CocaCola extends ColdDrink {
    @Override
    public String getName() {
        return "Coca cola";
    }

    @Override
    public float getPrice() {
        return 0.5f;
    }
}
