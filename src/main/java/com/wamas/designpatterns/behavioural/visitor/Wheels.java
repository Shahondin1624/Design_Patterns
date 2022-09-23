/*
 *
 *  *
 *  *  * Copyright (c) SSI Schaefer IT Solutions GmbH
 *  *
 *
 */

package com.wamas.designpatterns.behavioural.visitor;

public class Wheels implements Component {
    private int numberOf;

    public Wheels(int numberOf) {
        this.numberOf = numberOf;
    }

    public int getNumberOf() {
        return numberOf;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return String.format("Wheels.numberOf=%d", numberOf);
    }
}
