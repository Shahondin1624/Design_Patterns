/*
 *
 *  *
 *  *  * Copyright (c) SSI Schaefer IT Solutions GmbH
 *  *
 *
 */

package com.wamas.designpatterns.codedesign.composition;

/**
 * This image finalizes the difference to our inheritance solution -> not each one of our image-types will implement it,
 * but all of them will implement {@link Image}. In comparison to the inheritance-code, we only implement what we need
 */
public interface SavableImage extends Image {
    void saveImage(String path);
    void loadImage(String path);
}
