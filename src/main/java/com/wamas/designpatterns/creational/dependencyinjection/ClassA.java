/*
 *
 *  *
 *  *  * Copyright (c) SSI Schaefer IT Solutions GmbH
 *  *
 *
 */

package com.wamas.designpatterns.creational.dependencyinjection;

/***
 * A class that has a dependency on another different class. Instead of directly assigning it via a "new" {@link ClassB#ClassB(String)}
 * call it is injected via a setter or the constructor. Also rather than using a concrete implementation b is defined as an
 * interface
 */
public class ClassA {
    private ClassBInterface b;

    public ClassA(ClassB b) {
        this.b = b;
        /*
        rather than 'this.b = new ClassB();'
         */
    }

    public ClassA() {
    }

    public ClassBInterface getB() {
        return b;
    }

    public void setB(ClassB b) {
        this.b = b;
        /*
        rather than 'this.b = new ClassB();'
         */
    }

    @Override
    public String toString() {
        return String.format("ClassA:[b:%s]", b != null ? b.toString() : "null");
    }
}
