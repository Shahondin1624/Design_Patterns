/*
 *
 *  *
 *  *  * Copyright (c) SSI Schaefer IT Solutions GmbH
 *  *
 *
 */

package com.wamas.designpatterns.structural.decorator;

/**
 * adds a spoiler to the car without changing the rest
 */
public class WithSpoiler extends CarDecorator {
    public WithSpoiler(Car c) {
        super(c);
    }

    @Override
    public int getSpeed() {
        return super.getSpeed() + 20;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }
}
