/*
 *
 *  *
 *  *  * Copyright (c) SSI Schaefer IT Solutions GmbH
 *  *
 *
 */

package com.wamas.designpatterns.behavioural.observer;

/**
 * Instances of this interface will notify observers on change. This allows flexible design that can be extended later
 * should additional requirements for state-reactions should be needed. Also we can subscribe or remove observers during
 * runtime
 */
public interface Observable {
    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
}
