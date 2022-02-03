package com.designpatterns.creational.AbstractFactory.entities;

public class SkyScraper implements Building {
    @Override
    public String getType() {
        return "Sky scraper";
    }
}
