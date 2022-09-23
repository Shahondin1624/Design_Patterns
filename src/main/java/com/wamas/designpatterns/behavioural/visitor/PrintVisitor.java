/*
 *
 *  *
 *  *  * Copyright (c) SSI Schaefer IT Solutions GmbH
 *  *
 *
 */

package com.wamas.designpatterns.behavioural.visitor;

public class PrintVisitor implements Visitor {
    @Override
    public void visit(Engine engine) {
        System.out.println("engine = " + engine);
    }

    @Override
    public void visit(Wheels wheels) {
        System.out.println("wheels = " + wheels);
    }
}
