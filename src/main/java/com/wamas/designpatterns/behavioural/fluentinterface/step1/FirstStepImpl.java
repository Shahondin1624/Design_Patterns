/*
 *
 *  *
 *  *  * Copyright (c) SSI Schaefer IT Solutions GmbH
 *  *
 *
 */

package com.wamas.designpatterns.behavioural.fluentinterface.step1;

import com.wamas.designpatterns.behavioural.fluentinterface.step2.SecondStepIfc;
import com.wamas.designpatterns.behavioural.fluentinterface.step2.SecondStepImpl;

public class FirstStepImpl implements FirstStepIfc {
    private final String name;

    public FirstStepImpl(String name) {
        this.name = name;
    }

    /***
     * Creates the second configuration step
     * @param retries the constructor parameter for the second step. The stored first value is also passed in the constructor
     * @return the configured second step.
     */
    @Override
    public SecondStepIfc numberOfRetries(int retries) {
        return new SecondStepImpl(name, retries);
    }
}
