/*
 *
 *  *
 *  *  * Copyright (c) SSI Schaefer IT Solutions GmbH
 *  *
 *
 */

package com.wamas.designpatterns.codedesign.composition;

public class PngGrayScaleImage implements SavableImage {
    private GrayScaleImage image;


    @Override
    public short[][] getPixels() {
        return image.getPixels();
    }

    @Override
    public void setPixels(short[][] pixels) {
        image.setPixels(pixels);
    }

    @Override
    public void saveImage(String path) {
        //save image as .png
    }

    @Override
    public void loadImage(String path) {
        //load image at path and initialize this.image
    }
}
