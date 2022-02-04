package com.designpatterns.creational.Builder.entities;

public abstract class Burger implements Item {

    @Override
    public Packing pack() {
        return new AluminiumFoil();
    }
}
