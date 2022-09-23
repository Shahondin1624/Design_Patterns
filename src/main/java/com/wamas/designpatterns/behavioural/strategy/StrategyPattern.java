/*
 *
 *  *
 *  *  * Copyright (c) SSI Schaefer IT Solutions GmbH
 *  *
 *
 */

package com.wamas.designpatterns.behavioural.strategy;

/***
 * With the Strategy Pattern logic that should be flexible is moved to a field of the class. This field is defined as an
 * interface rather than a concrete implementation. Whenever the handling method on the outer class is called, the input
 * is delegated to the current strategy object that executes its logic
 */
public class StrategyPattern {
    public static void main(String[] args) {
        InputHandlingStrategy print = new PrintInput();
        InputHandlingStrategy ignore = new IgnoreInput();
        InputHandler handler = new InputHandler(print);
        handler.handleInput("Test");
        handler.setHandlingStrategy(ignore);
        handler.handleInput("Test");
    }
}
