/*
 *
 *  *
 *  *  * Copyright (c) SSI Schaefer IT Solutions GmbH
 *  *
 *
 */

package com.wamas.designpatterns.behavioural.fluentinterface.step1;

import com.wamas.designpatterns.behavioural.fluentinterface.step2.SecondStepIfc;

/***
 * marker for the first configuration step
 */
public interface FirstStepIfc {
    SecondStepIfc numberOfRetries(int retries);
}
