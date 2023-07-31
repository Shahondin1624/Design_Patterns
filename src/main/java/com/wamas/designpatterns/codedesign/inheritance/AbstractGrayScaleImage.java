/*
 *
 *  *
 *  *  * Copyright (c) SSI Schaefer IT Solutions GmbH
 *  *
 *
 */

package com.wamas.designpatterns.codedesign.inheritance;

/**
 * We create an abstract superclass here, that defines two abstract methods, that all subclasses shall implement,
 * because in our first draft of our domain-model we only have to deal with images that can and should be stored on disk
 * (Jpg- and Png-Image). For this, our contract (the abstract class) works just fine. However, in our next we have to
 * implement an Image that shall only exist in memory for users to draw in directly. Now our contract does not model
 * reality accurately anymore, because we have to implement save and load even though we don't need them. Here the basic
 * inheritance-model begins to show its flaws -> Our abstract class that we created to satisfy the DRY-principle now
 * does not fit our real world circumstances anymore. Our solution to avoid a large amount of refactoring (this is a very
 * simple example, but imagine this with multiple layers of inheritance) is to override the methods we don't require and
 * just throw an exception. This however, is really undesirable!
 */
public abstract class AbstractGrayScaleImage {
    /*
    Logic that will be required by all types of images (or so we thought when we initially modelled our code)
     */
    private short[][] pixels;

    public AbstractGrayScaleImage(short[][] pixels) {
        this.pixels = pixels;
    }

    public void setPixels(short[][] pixels) {
        this.pixels = pixels;
    }

    public short[][] getPixels() {
        return pixels;
    }

    public abstract void save(String path);

    public abstract void load(String path);
}
