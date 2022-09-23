/*
 *
 *  *
 *  *  * Copyright (c) SSI Schaefer IT Solutions GmbH
 *  *
 *
 */

package com.wamas.designpatterns.structural.decorator;

/***
 * adds white racing stripes without changing anything else
 */
public class WithWhiteStripes extends CarDecorator {
    public WithWhiteStripes(Car c) {
        super(c);
    }

    @Override
    public int getSpeed() {
        return super.getSpeed() + 5; //RacingStripes increase the speed
    }

    @Override
    public String getColor() {
        return super.getColor() + ", white racing stripes";
    }
}
