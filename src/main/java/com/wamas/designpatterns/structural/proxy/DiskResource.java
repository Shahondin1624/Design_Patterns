/*
 *
 *  *
 *  *  * Copyright (c) SSI Schaefer IT Solutions GmbH
 *  *
 *
 */

package com.wamas.designpatterns.structural.proxy;

/***
 * Resource that has to be loaded once when being created
 */
public class DiskResource implements Resource {
    private String filePath;

    public DiskResource(String filePath) {
        this.filePath = filePath;
        loadResourceFromDisk(filePath);
    }

    private void loadResourceFromDisk(String resourcePath) {
        System.out.println("Loading resource: " + resourcePath);
    }

    @Override
    public void showResource() {
        System.out.println("Displaying resource: " + filePath);
    }
}
