/*
 *
 *  *
 *  *  * Copyright (c) SSI Schaefer IT Solutions GmbH
 *  *
 *
 */

package com.wamas.designpatterns.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class ExampleObservable implements Observable {
    private List<Observer> registeredObserver = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        registeredObserver.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        registeredObserver.remove(observer);
    }

    @Override
    public void notifyObservers() {
        registeredObserver.forEach(observer -> observer.onChange(this));
    }
}
