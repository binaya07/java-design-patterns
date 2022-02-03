package com.designpatterns.creational.AbstractFactory;

import com.designpatterns.creational.AbstractFactory.entities.*;

public class MusicalInstrumentFactory implements AbstractFactory<MusicalInstrument> {
    @Override
    public MusicalInstrument create(String type) {
        if (type.equals("guitar")) {
            return new Guitar();
        } else if (type.equals("drum")) {
            return new Drum();
        } else {
            throw new IllegalArgumentException("Invalid building type.");
        }
    }
}
