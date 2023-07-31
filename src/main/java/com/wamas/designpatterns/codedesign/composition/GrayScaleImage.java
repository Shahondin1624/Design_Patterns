/*
 *
 *  *
 *  *  * Copyright (c) SSI Schaefer IT Solutions GmbH
 *  *
 *
 */

package com.wamas.designpatterns.codedesign.composition;

/***
 * This class now has the common logic we shared by inheritance with our abstract class earlier. We will use it to
 * delegate the shared logic calls to it
 */
public class GrayScaleImage {
    private short[][] pixels;

    public GrayScaleImage(short[][] pixels) {
        this.pixels = pixels;
    }

    public void setPixels(short[][] pixels) {
        this.pixels = pixels;
    }

    public short[][] getPixels() {
        return pixels;
    }
}
