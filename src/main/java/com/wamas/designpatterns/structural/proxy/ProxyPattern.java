/*
 *
 *  *
 *  *  * Copyright (c) SSI Schaefer IT Solutions GmbH
 *  *
 *
 */

package com.wamas.designpatterns.structural.proxy;

/***
 * The proxy pattern allows to wrap existing logic with additional logic while at the same time does not change the signature
 */
public class ProxyPattern {
    public static void main(String[] args) {
        Resource r1 = new ProxyResource("testfile");
        r1.showResource();
        r1.showResource();
    }
}
