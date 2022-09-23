package com.wamas.designpatterns.creational.factory;

/***
 * Second implementation of the abstract supertype
 */
public class Subtype_2 implements Supertype {
    @Override
    public void printClass() {
        System.out.println(Subtype_2.class.getName());
    }
}
