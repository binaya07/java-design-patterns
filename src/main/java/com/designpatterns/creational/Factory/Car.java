package com.designpatterns.creational.Factory;

public class Car implements Vehicle{
    @Override
    public String drive() {
        return "Car is driving now .... Vrrr";
    }
}
