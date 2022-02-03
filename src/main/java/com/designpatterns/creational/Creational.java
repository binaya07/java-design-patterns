package com.designpatterns.creational;

import com.designpatterns.creational.AbstractFactory.AbstractFactory;
import com.designpatterns.creational.AbstractFactory.FactoryProvider;
import com.designpatterns.creational.AbstractFactory.entities.Building;
import com.designpatterns.creational.AbstractFactory.entities.MusicalInstrument;
import com.designpatterns.creational.Factory.Vehicle;
import com.designpatterns.creational.Factory.VehicleFactory;
import com.designpatterns.creational.Factory.VehicleType;
import com.designpatterns.creational.Singleton.SingletonExample;

public class Creational {

    public static void examples() {
        singleton();
        factory();
        abstractFactory();
    }

    /**
     *
     * Singleton Design Pattern
     *
     * 1. Single instance in the program.
     * 2. Lazy initialization -> create object on first use and reuse that object.
     * 3. For multithreaded applications, use synchronized {} code block.
     * 4. Private variable and private constructor.
     *
     */
    private static void singleton() {
        SingletonExample singletonExample = SingletonExample.getSingletonObject();
        System.out.println(singletonExample.doSomething());
    }

    /**
     * Factory Design Pattern
     *
     * 1. Create a factory method in an interface.
     * 2. Implement the factory methods in subclasses.
     * 3. Depending on the argument, instantiate appropriate subclasses.
     */
    private static void factory() {
        Vehicle car = VehicleFactory.getVehicle(VehicleType.CAR);
        Vehicle bike = VehicleFactory.getVehicle(VehicleType.BIKE);
        System.out.println(car.drive());
        System.out.println(bike.drive());
    }

    /**
     * Abstract Factory Design Pattern
     *
     * 1. Provide an interface for creating families of related or dependent objects without specifying their concrete classes.
     *    The client is independent of how we create and compose the objects in the system
     * 2. A hierarchy that encapsulates: many possible "platforms", and the construction of a suite of "products".
     * 3. We need a run-time value to construct a particular dependency
     * 4. While the pattern is great when creating predefined objects, adding the new ones might be challenging.
     *    To support the new type of objects will require changing the AbstractFactory class and all of its subclasses.
     */
    private static void abstractFactory() {
        AbstractFactory<Building> buildingFactory = FactoryProvider.getFactory("building");
        AbstractFactory<MusicalInstrument> musicalInstrumentFactory = FactoryProvider.getFactory("musicalInstrument");

        Building skyscraper = buildingFactory.create("skyscraper");
        Building bungalow = buildingFactory.create("bungalow");

        MusicalInstrument guitar = musicalInstrumentFactory.create("guitar");
        MusicalInstrument drum = musicalInstrumentFactory.create("drum");

        System.out.println(skyscraper.getType());
        System.out.println(bungalow.getType());

        System.out.println(guitar.play());
        System.out.println(drum.play());
    }
}
