/*
 *
 *  *
 *  *  * Copyright (c) SSI Schaefer IT Solutions GmbH
 *  *
 *
 */

package com.wamas.designpatterns.behavioural.fluentinterface;

import com.wamas.designpatterns.behavioural.fluentinterface.step3.ThirdStepIfc;

/***
 * The fluent interface pattern is pretty similar to the builder pattern, but defines an order in which the chained methods
 * have to be called. This is important, when the order is relevant e.g. when logic is called on already set values
 */
public class FluentInterfacePattern {
    public static void main(String[] args) {
        ThirdStepIfc configuration = FinalConfiguration.configurationName("config") //
                .numberOfRetries(5) //
                .setActive(true);
        System.out.println("configuration = " + configuration);
    }
}
