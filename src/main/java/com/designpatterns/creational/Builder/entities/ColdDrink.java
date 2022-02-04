package com.designpatterns.creational.Builder.entities;

public abstract class ColdDrink implements Item{

    @Override
    public Packing pack() {
        return new Bottle();
    }
}
