/*
 *
 *  *
 *  *  * Copyright (c) SSI Schaefer IT Solutions GmbH
 *  *
 *
 */

package com.wamas.designpatterns.behavioural.visitor;

import java.util.List;

/**
 * Groups the components and offers convenience method to visit them
 */
public class Car implements Component {
    private final List<Component> components;

    public Car(List<Component> components) {
        this.components = components;
    }

    public Car(Component... components) {
        this(List.of(components));
    }


    @Override
    public void accept(Visitor visitor) {
        for (Component component : components) {
            component.accept(visitor);
        }
    }
}
