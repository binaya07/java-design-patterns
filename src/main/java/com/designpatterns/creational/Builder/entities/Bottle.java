package com.designpatterns.creational.Builder.entities;

public class Bottle implements Packing {
    @Override
    public String wrap() {
        return "Packed in a bottle.";
    }
}
