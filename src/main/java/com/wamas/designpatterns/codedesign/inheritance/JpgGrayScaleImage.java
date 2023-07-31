/*
 *
 *  *
 *  *  * Copyright (c) SSI Schaefer IT Solutions GmbH
 *  *
 *
 */

package com.wamas.designpatterns.codedesign.inheritance;

public class JpgGrayScaleImage extends AbstractGrayScaleImage {
    public JpgGrayScaleImage(int x, int y) {
        super(new short[x][y]);
    }

    @Override
    public void save(String path) {
        //Compress as .jpg and save
    }

    @Override
    public void load(String path) {
        //read as .jpg and initialize parent-array
    }
}
