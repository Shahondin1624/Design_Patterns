/*
 *
 *  *
 *  *  * Copyright (c) SSI Schaefer IT Solutions GmbH
 *  *
 *
 */

package com.wamas.designpatterns.codedesign.composition;

/**
 * Because we define our shared logic by a composite, we don't need to override any methods we don't require. This
 * avoids confusing logic and keeps our code more lean
 */
public class DrawableImage implements Image {
    private GrayScaleImage image;


    @Override
    public short[][] getPixels() {
        return image.getPixels();
    }

    @Override
    public void setPixels(short[][] pixels) {
        image.setPixels(pixels);
    }

    public void drawPixel(int x, int y, short brightness) {
        if (x >= getPixels().length || y >= getPixels()[0].length) {
            throw new IllegalArgumentException("Coordinate out of bounds");
        }
        getPixels()[x][y] = brightness;
    }
}
