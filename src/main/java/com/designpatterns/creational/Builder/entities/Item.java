package com.designpatterns.creational.Builder.entities;

public interface Item {

    String getName();

    Packing pack();

    float getPrice();
}
