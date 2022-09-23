/*
 *
 *  *
 *  *  * Copyright (c) SSI Schaefer IT Solutions GmbH
 *  *
 *
 */

package com.wamas.designpatterns.behavioural.visitor;

import java.util.ArrayList;
import java.util.List;

public class StoreComponentsVisitor implements Visitor {
    private final List<Component> visitedComponents = new ArrayList<>();

    @Override
    public void visit(Engine engine) {
        visitedComponents.add(engine);
    }

    @Override
    public void visit(Wheels wheels) {
        visitedComponents.add(wheels);
    }

    public void printVisitedComponents() {
        System.out.println("visitedComponents = " + visitedComponents);
    }
}
