package com.designpatterns.creational.AbstractFactory;

public class FactoryProvider {

    public static AbstractFactory getFactory(String choice){

        if("building".equalsIgnoreCase(choice)){
            return new BuildingFactory();
        }

        if("musicalInstrument".equalsIgnoreCase(choice)){
            return new MusicalInstrumentFactory();
        }

        return null;
    }
}
