/*
 *
 *  *
 *  *  * Copyright (c) SSI Schaefer IT Solutions GmbH
 *  *
 *
 */

package com.wamas.designpatterns.creational.singleton;

import com.wamas.designpatterns.creational.singleton.manager.Manager;

/***
 * The singleton pattern allows easy access to classes that should only be created once. It should only be accessed by the
 * getInstance() method. Storing a reference to it can circumvent concurrent thread safety so it shouldn't be done
 */
public class SingletonPattern {
    public static void main(String[] args) {
        String name1 = "Tom";
        String name2 = "Tim";
        boolean canAddName1 = Manager.getInstance().addName(name1);
        System.out.println("canAddName1 = " + canAddName1);
        Manager.getInstance().addName(name2);
        canAddName1 = Manager.getInstance().addName(name1);
        System.out.println("canAddName1 = " + canAddName1);
    }
}
