/*
 *
 *  *
 *  *  * Copyright (c) SSI Schaefer IT Solutions GmbH
 *  *
 *
 */

package com.wamas.designpatterns.behavioural.strategy;

/***
 * Implementing {@link InputHandlingStrategy}: Will print the input
 */
public class PrintInput implements InputHandlingStrategy {
    @Override
    public void handleInput(String input) {
        System.out.println(input);
    }
}
