/*
 *
 *  *
 *  *  * Copyright (c) SSI Schaefer IT Solutions GmbH
 *  *
 *
 */

package com.wamas.designpatterns.behavioural.strategy;

/***
 * Supertype for the specific strategy
 */
public interface InputHandlingStrategy {
    void handleInput(String input);
}
