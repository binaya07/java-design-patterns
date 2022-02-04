package com.designpatterns.creational.Builder.entities;

public class AluminiumFoil implements Packing {
    @Override
    public String wrap() {
        return "Packed in aluminium foil.";
    }
}
