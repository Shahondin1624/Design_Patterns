package com.wamas.designpatterns.creational.factory;

/***
 * The factory offers static methods, that return instances of the specific supertype, but choose the concrete subclass
 * by themselves
 */
public class SupertypeFactory {
    public static Supertype createInstance() {
        return new Subtype_1();
    }

    public static Supertype createInstance(boolean functional) {
        return functional ? new Subtype_2() : createInstance();
    }
}
