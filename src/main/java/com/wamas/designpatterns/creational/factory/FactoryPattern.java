/*
 *
 *  *
 *  *  * Copyright (c) SSI Schaefer IT Solutions GmbH
 *  *
 *
 */

package com.wamas.designpatterns.creational.factory;

/***
 * The Factory-Pattern pattern makes use of static factory methods to provide concrete implementations of the specified
 * supertype while hiding away which specific subtypes are actually returned
 */
public class FactoryPattern {
    public static void main(String[] args) {
        Supertype obj1 = SupertypeFactory.createInstance();
        Supertype obj2 = SupertypeFactory.createInstance(true);
        obj1.printClass();
        obj2.printClass();
    }
}
