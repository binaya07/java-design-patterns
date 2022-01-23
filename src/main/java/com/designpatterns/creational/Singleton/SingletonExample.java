package com.designpatterns.creational.Singleton;

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