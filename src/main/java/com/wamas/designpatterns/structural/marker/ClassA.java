/*
 *
 *  *
 *  *  * Copyright (c) SSI Schaefer IT Solutions GmbH
 *  *
 *
 */

package com.wamas.designpatterns.structural.marker;

/***
 * has nothing in common with {@link ClassB}
 */
public class ClassA {
    protected String name;

    public ClassA(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
