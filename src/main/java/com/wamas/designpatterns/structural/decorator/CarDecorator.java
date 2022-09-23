/*
 *
 *  *
 *  *  * Copyright (c) SSI Schaefer IT Solutions GmbH
 *  *
 *
 */

package com.wamas.designpatterns.structural.decorator;

/***
 * Abstract enhancer class that can be overwritten by concrete implementations
 */
public abstract class CarDecorator implements Car {
    private final Car decoratedCar;

    public CarDecorator(Car c) {
        this.decoratedCar = c;
    }

    @Override
    public int getSpeed() { // Implementing methods of the interface
        return decoratedCar.getSpeed();
    }

    @Override
    public String getColor() {
        return decoratedCar.getColor();
    }
}
