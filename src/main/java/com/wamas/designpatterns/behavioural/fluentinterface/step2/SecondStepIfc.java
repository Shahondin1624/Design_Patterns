/*
 *
 *  *
 *  *  * Copyright (c) SSI Schaefer IT Solutions GmbH
 *  *
 *
 */

package com.wamas.designpatterns.behavioural.fluentinterface.step2;

import com.wamas.designpatterns.behavioural.fluentinterface.step3.ThirdStepIfc;

/***
 * marker for the second configuration step
 */
public interface SecondStepIfc {
    ThirdStepIfc setActive(boolean active);
}
