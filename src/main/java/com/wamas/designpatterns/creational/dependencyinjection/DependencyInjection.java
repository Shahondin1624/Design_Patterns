/*
 *
 *  *
 *  *  * Copyright (c) SSI Schaefer IT Solutions GmbH
 *  *
 *
 */

package com.wamas.designpatterns.creational.dependencyinjection;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

/***
 * Dependency injection provides a more flexible way to populate fields rather than hardcoding the attribute values
 */
public class DependencyInjection {
    public static void main(String[] args) {
        ClassB b = new ClassB("Test");
        //constructor injection
        ClassA a = new ClassA(b);
        //setter injection
        ClassA a1 = new ClassA();
        a1.setB(b);
        //dependency injection by using Guice (dependency injection framework)
        Injector injector= Guice.createInjector(new InjectionModule());
        ClassBInterface injected = injector.getInstance(ClassBInterface.class);
        ClassA a2 = injector.getInstance(ClassA.class);

        System.out.println(b);
        System.out.println(a);
        System.out.println(a1);
        System.out.println(injected);
        System.out.println(a2);
    }

    private static class InjectionModule extends AbstractModule {
        @Override
        protected void configure() {
            super.configure();
            bind(ClassBInterface.class).to(ClassB.class);
        }
    }
}
