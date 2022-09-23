/*
 *
 *  *
 *  *  * Copyright (c) SSI Schaefer IT Solutions GmbH
 *  *
 *
 */

package com.wamas.designpatterns.structural.proxy;

/***
 * Instead of preloading the resource it wraps the underlying {@link DiskResource} and loads it dynamically on demand
 */
public class ProxyResource implements Resource {
    private String filePath;
    private DiskResource resource;

    public ProxyResource(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void showResource() {
        if (resource == null) {
            resource = new DiskResource(filePath);
        }
        resource.showResource();
    }
}
