package com.designpatterns.creational.AbstractFactory.entities;

public class Drum implements MusicalInstrument{
    @Override
    public String play() {
        return "Baa dumm tss";
    }
}
