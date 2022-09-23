/*
 *
 *  *
 *  *  * Copyright (c) SSI Schaefer IT Solutions GmbH
 *  *
 *
 */

package com.wamas.designpatterns.structural.marker;

/***
 * Still has nothing in common with {@link MarkedClassB} but now shares the same superclass
 */
public class MarkedClassA extends ClassA implements MarkerInterface {

    public MarkedClassA(String name) {
        super(name);
    }
}
