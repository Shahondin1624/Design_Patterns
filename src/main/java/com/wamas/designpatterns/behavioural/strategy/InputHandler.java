/*
 *
 *  *
 *  *  * Copyright (c) SSI Schaefer IT Solutions GmbH
 *  *
 *
 */

package com.wamas.designpatterns.behavioural.strategy;

/***
 * Rather than hardcoding the behaviour how input should be handled the functionality is moved into a flexible strategy
 * attribute which is called whenever {@link InputHandler#handleInput(String)} is called. This allows for dynamic switching
 * of the underlying logic
 */
public class InputHandler {
    //Here the interface is defined rather than a concrete implementation
    private InputHandlingStrategy handlingStrategy;

    public InputHandler(InputHandlingStrategy handlingStrategy) {
        this.handlingStrategy = handlingStrategy;
    }

    public void setHandlingStrategy(InputHandlingStrategy handlingStrategy) {
        this.handlingStrategy = handlingStrategy;
    }

    public void handleInput(String input) {
        handlingStrategy.handleInput(input);
    }
}
