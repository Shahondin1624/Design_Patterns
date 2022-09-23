/*
 *
 *  *
 *  *  * Copyright (c) SSI Schaefer IT Solutions GmbH
 *  *
 *
 */package com.wamas.designpatterns.creational.builder;

/***
 * The builder pattern allows to reduce complexity of constructors
 */
public class BuilderPattern {
    public static void main(String[] args) {
        ComplexObject obj = ComplexObject.ComplexObjectBuilder.aComplexObject("Test") //
                .withActive(true) //
                .withX(12) //
                .withY(5) //
                .withZ(100) //
                .build();
        ComplexObject obj2 = ComplexObject.ComplexObjectBuilder.aComplexObject("Test_2") //
                .withActive(true) //
                .withX(12) //
                .withY(5) //
                .withZ(100) //
                .withNotes("Here all fields are initialized") //
                .build();
    }
}
