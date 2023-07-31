/*
 *
 *  *
 *  *  * Copyright (c) SSI Schaefer IT Solutions GmbH
 *  *
 *
 */

package com.wamas.designpatterns.codedesign.inheritance;

public class PngGrayScaleImage extends AbstractGrayScaleImage {
    public PngGrayScaleImage(int x, int y) {
        super(new short[x][y]);
    }

    @Override
    public void save(String path) {
        //save as .png
    }

    @Override
    public void load(String path) {
        //read as .png and initialize parent-array
    }
}
