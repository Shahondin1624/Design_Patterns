/*
 *
 *  *
 *  *  * Copyright (c) SSI Schaefer IT Solutions GmbH
 *  *
 *
 */

package com.wamas.designpatterns.behavioural.observer;

/**
 * Observers can be subscribed to a specific type of event and will be called whenever such an event occurs. This allows
 * reacting to state changes in a loosely coupled way. Only observers that are subscribed to a specific event will be
 * notified. Usually instead of passing the observed value as argument, you would pass events instead. Those define more
 * concrete attributes or could just be Strings (in json format for example)
 */
@FunctionalInterface
public interface Observer {
    void onChange(Observable observed);
}
