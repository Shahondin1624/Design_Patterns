/*
 *
 *  *
 *  *  * Copyright (c) SSI Schaefer IT Solutions GmbH
 *  *
 *
 */

package com.wamas.designpatterns.behavioural.visitor;

/***
 * The visitor pattern allows dynamic extension of functionality with double dispatch. The visited object passes itself in
 * the accept()-method of the visitor
 */
public class VisitorPattern {
    public static void main(String[] args) {
        Engine engine = new Engine("V8");
        Wheels wheels = new Wheels(4);
        Car car = new Car(engine, wheels);
        Visitor printVisitor = new PrintVisitor();
        StoreComponentsVisitor storeComponentsVisitor = new StoreComponentsVisitor();
        car.accept(printVisitor);
        car.accept(storeComponentsVisitor);
        storeComponentsVisitor.printVisitedComponents();
    }
}
