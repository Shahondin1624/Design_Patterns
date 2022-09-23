/*
 *
 *  *
 *  *  * Copyright (c) SSI Schaefer IT Solutions GmbH
 *  *
 *
 */

package com.wamas.designpatterns.structural.decorator;

/***
 * Simple base implementation of the provided super type
 */
public class SimpleCar implements Car {
    @Override
    public int getSpeed() {
        return 1;
    }

    @Override
    public String getColor() {
        return "red";
    }
}
