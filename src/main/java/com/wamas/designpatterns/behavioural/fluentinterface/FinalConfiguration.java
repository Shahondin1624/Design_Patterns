/*
 *
 *  *
 *  *  * Copyright (c) SSI Schaefer IT Solutions GmbH
 *  *
 *
 */

package com.wamas.designpatterns.behavioural.fluentinterface;

import com.wamas.designpatterns.behavioural.fluentinterface.step1.FirstStepIfc;
import com.wamas.designpatterns.behavioural.fluentinterface.step1.FirstStepImpl;
import com.wamas.designpatterns.behavioural.fluentinterface.step3.ThirdStepIfc;

/***
 * The final configuration
 */
public class FinalConfiguration implements ThirdStepIfc {
    private final String name;
    private final int retries;
    private final boolean active;

    public FinalConfiguration(String name, int retries, boolean active) {
        this.name = name;
        this.retries = retries;
        this.active = active;
    }

    /***
     * Entry point to start configuring
     * @param name the constructor parameter for the first step
     * @return the configured first step
     */
    public static FirstStepIfc configurationName(String name) {
        return new FirstStepImpl(name);
    }

    @Override
    public String toString() {
        return String.format("config: name=%s, retries=%d, active=%b", name, retries, active);
    }
}
