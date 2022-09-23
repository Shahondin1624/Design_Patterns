/*
 *
 *  *
 *  *  * Copyright (c) SSI Schaefer IT Solutions GmbH
 *  *
 *
 */

package com.wamas.designpatterns.behavioural.strategy;

/***
 * Implementing {@link InputHandlingStrategy}: Will ignore the input
 */
public class IgnoreInput implements InputHandlingStrategy {
    @Override
    public void handleInput(String input) {
        System.out.println("Ignoring input...");
    }
}
