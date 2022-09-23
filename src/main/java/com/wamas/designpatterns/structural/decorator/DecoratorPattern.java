/*
 *
 *  *
 *  *  * Copyright (c) SSI Schaefer IT Solutions GmbH
 *  *
 *
 */

package com.wamas.designpatterns.structural.decorator;

/***
 * The decorator pattern allows dynamically enhancing instances of a supertype without having to provide subclasses that
 * implement all functionality. Instead, subclasses only add functionality to the already existing class by combining the
 * existing functionality with their own
 */
public class DecoratorPattern {
    public static void main(String[] args) {
        Car simpleCar = new SimpleCar();
        printCar(simpleCar);
        simpleCar = new WithSpoiler(simpleCar);
        printCar(simpleCar);
        simpleCar = new WithWhiteStripes(simpleCar);
        printCar(simpleCar);
    }

    private static void printCar(Car car) {
        String carString = String.format("Car: Speed=%d, Color=%s", car.getSpeed(), car.getColor());
        System.out.println(carString);
    }
}
