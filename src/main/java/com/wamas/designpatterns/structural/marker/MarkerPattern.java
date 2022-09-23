/*
 *
 *  *
 *  *  * Copyright (c) SSI Schaefer IT Solutions GmbH
 *  *
 *
 */

package com.wamas.designpatterns.structural.marker;

import java.util.ArrayList;
import java.util.List;

/***
 * The Marker pattern allows grouping unrelated classes into a shared context. This is especially useful in combination
 * with generics
 */
public class MarkerPattern {
    public static void main(String[] args) {
        ClassA ca = new ClassA("Test");
        ClassB cb = new ClassB();
        List<ClassA> list = new ArrayList<>();
        list.add(ca);
        //list.add(cb); Not possible because cb is not of type ClassA4
        MarkedClassA mca = new MarkedClassA("MarkedTest");
        MarkedClassB mcb = new MarkedClassB();
        //Now both instances can be added to the list, because their common identity is the same interface
        List<MarkerInterface> list2 = new ArrayList<>();
        list2.add(mca);
        list2.add(mcb);
    }
}
