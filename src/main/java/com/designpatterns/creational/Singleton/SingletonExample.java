package com.designpatterns.creational.Singleton;

public class SingletonExample {

    private static SingletonExample singletonObject;

    private SingletonExample() {}

    public static SingletonExample getSingletonObject() {
        if (singletonObject == null) {
            singletonObject = new SingletonExample();
        }
        return singletonObject;
    }

    public String doSomething() {
        return "Singleton work";
    }
}