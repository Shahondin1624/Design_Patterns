/*
 *
 *  *
 *  *  * Copyright (c) SSI Schaefer IT Solutions GmbH
 *  *
 *
 */

package com.wamas.designpatterns.behavioural.visitor;

/***
 * Marker interface for classes that should interact with a visitor
 */
public interface Component {
    void accept(Visitor visitor);
}
