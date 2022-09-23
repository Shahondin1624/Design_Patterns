/*
 *
 *  *
 *  *  * Copyright (c) SSI Schaefer IT Solutions GmbH
 *  *
 *
 */

package com.wamas.designpatterns.creational.dependencyinjection;

import javax.inject.Inject;

public class ClassB implements ClassBInterface {
    private String name;

    @Inject
    public ClassB(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("ClassB:[name=%s]", name);
    }
}
