/*
 *
 *  *
 *  *  * Copyright (c) SSI Schaefer IT Solutions GmbH
 *  *
 *
 */

package com.wamas.designpatterns.codedesign.inheritance;

/**
 * This class does need some of the properties and functionality of our abstract superclass, but not all of them, which
 * is very problematic
 */
public class DrawableGrayScaleImage extends AbstractGrayScaleImage {
    public DrawableGrayScaleImage(short[][] pixels) {
        super(pixels);
    }

    @Override
    //We have to override these methods, even though we don't need them
    public void save(String path) {
        throw new UnsupportedOperationException("Not valid for this type of image");
    }

    @Override
    public void load(String path) {
        throw new UnsupportedOperationException("Not valid for this type of image");
    }

    public void drawPixel(int x, int y, short brightness) {
        if (x >= getPixels().length || y >= getPixels()[0].length) {
            throw new IllegalArgumentException("Coordinate out of bounds");
        }
        getPixels()[x][y] = brightness;
    }
}
