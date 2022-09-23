package com.wamas.designpatterns.creational.factory;

public class Factory {
    public static void main(String[] args) {
        Supertype obj1 = SupertypeFactory.createInstance();
        Supertype obj2 = SupertypeFactory.createInstance(true);
        obj1.printClass();
        obj2.printClass();
    }
}
