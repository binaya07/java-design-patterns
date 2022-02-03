package com.designpatterns.creational.AbstractFactory;

import com.designpatterns.creational.AbstractFactory.entities.Building;
import com.designpatterns.creational.AbstractFactory.entities.Bungalow;
import com.designpatterns.creational.AbstractFactory.entities.SkyScraper;

public class BuildingFactory implements AbstractFactory<Building> {

    @Override
    public Building create(String type) {
        if (type.equals("skyscraper")) {
            return new SkyScraper();
        } else if (type.equals("bungalow")) {
            return new Bungalow();
        } else {
            throw new IllegalArgumentException("Invalid building type.");
        }
    }
}
