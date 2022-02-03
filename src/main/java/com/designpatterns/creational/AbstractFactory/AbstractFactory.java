package com.designpatterns.creational.AbstractFactory;

public interface AbstractFactory<T> {

    T create(String type);
}
