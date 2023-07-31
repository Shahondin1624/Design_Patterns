/*
 *
 *  *
 *  *  * Copyright (c) SSI Schaefer IT Solutions GmbH
 *  *
 *
 */

package com.wamas.designpatterns.behavioural.observer;

/**
 * Here we define two observers and subscribe them to our Observable. Afterward, we unsubscribe one to demonstrate that
 * it now won't be notified anymore
 */
public class ObserverPattern {
    public static void main(String[] args) {
        ExampleObservable observable = new ExampleObservable();
        Observer observer1 = observed -> System.out.println("Observer1 was notified");
        Observer observer2 = observed -> System.out.println("Observer2 was notified");
        observable.notifyAllObservers();
        observable.registerObserver(observer1);
        observable.registerObserver(observer2);
        observable.notifyAllObservers();
        observable.unregisterObserver(observer2);
        observable.notifyAllObservers();
    }
}
