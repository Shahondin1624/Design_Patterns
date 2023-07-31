/*
 *
 *  *
 *  *  * Copyright (c) SSI Schaefer IT Solutions GmbH
 *  *
 *
 */

package com.wamas.designpatterns.codedesign.composition;

/**
 * When solving our domain-problem with composition instead of inheritance we don't need to define abstract classes
 * but instead use the polymorphism provided by simple interface-inheritance. This interface is the base interface for
 * all images and thus only defines the most basic methods. Later on we make use of the strategy-pattern (to delegate
 * the logic-calls that are the same for all types of images and create sub-interfaces for mor specialized behaviour.
 */
public interface Image {
    short[][] getPixels();
    void setPixels(short[][] pixels);
}
