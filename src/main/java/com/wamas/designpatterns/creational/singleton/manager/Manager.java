/*
 *
 *  *
 *  *  * Copyright (c) SSI Schaefer IT Solutions GmbH
 *  *
 *
 */

package com.wamas.designpatterns.creational.singleton.manager;

import java.util.HashSet;
import java.util.Set;

/***
 * Only one instance of the singleton class is allowed per project. It can only be accessed via the getInstance() method
 * Watch out: If your project uses multiple threads, you have to deal with concurrent manipulation of this singleton
 */
public class Manager {
    private static final Manager instance = new Manager();
    private final Set<String> names = new HashSet<>();

    private Manager() {
    }

    public boolean addName(String name) {
        return names.add(name);
    }

    public static Manager getInstance() {
        return instance;
    }
}
