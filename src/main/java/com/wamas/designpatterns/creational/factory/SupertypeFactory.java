package com.wamas.designpatterns.creational.factory;

public class SupertypeFactory {
    public static Supertype createInstance() {
        return new Subtype_1();
    }

    public static Supertype createInstance(boolean functional) {
        return functional ? new Subtype_2() : createInstance();
    }
}
