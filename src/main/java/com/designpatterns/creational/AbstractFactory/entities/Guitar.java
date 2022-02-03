package com.designpatterns.creational.AbstractFactory.entities;

public class Guitar implements MusicalInstrument{
    @Override
    public String play() {
        return "EADGBE";
    }
}
