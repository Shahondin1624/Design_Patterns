/*
 *
 *  *
 *  *  * Copyright (c) SSI Schaefer IT Solutions GmbH
 *  *
 *
 */

package com.wamas.designpatterns.behavioural.fluentinterface.step2;

import com.wamas.designpatterns.behavioural.fluentinterface.FinalConfiguration;
import com.wamas.designpatterns.behavioural.fluentinterface.step3.ThirdStepIfc;

public class SecondStepImpl implements SecondStepIfc {
    private final String name;
    private final int retries;

    public SecondStepImpl(String name, int retries) {
        this.name = name;
        this.retries = retries;
    }

    /***
     * Creates the second configuration step
     * @param active the constructor parameter for the third step. The previous values also passed in the constructor
     * @return the fully configured object
     */
    @Override
    public ThirdStepIfc setActive(boolean active) {
        return new FinalConfiguration(name, retries, active);
    }
}
