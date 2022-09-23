/*
 *
 *  *
 *  *  * Copyright (c) SSI Schaefer IT Solutions GmbH
 *  *
 *
 */

package com.wamas.designpatterns.creational.builder;

/***
 * A complex object that has many different mandatory and optional fields that would require a lot of different and
 * long constructors
 */
public class ComplexObject {
    private final String name;
    private int x, y, z;
    private String notes;
    private boolean active;

    private ComplexObject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    /***
     * The builder allows dynamic creation of the complex object in a more human-readable way by method chaining
     */
    public static final class ComplexObjectBuilder {
        private final String name;
        private int x;
        private int y;
        private int z;
        private String notes;
        private boolean active;

        private ComplexObjectBuilder(String name) {
            this.name = name;
        }

        public static ComplexObjectBuilder aComplexObject(String name) {
            return new ComplexObjectBuilder(name);
        }

        public ComplexObjectBuilder withX(int x) {
            this.x = x;
            return this;
        }

        public ComplexObjectBuilder withY(int y) {
            this.y = y;
            return this;
        }

        public ComplexObjectBuilder withZ(int z) {
            this.z = z;
            return this;
        }

        public ComplexObjectBuilder withNotes(String notes) {
            this.notes = notes;
            return this;
        }

        public ComplexObjectBuilder withActive(boolean active) {
            this.active = active;
            return this;
        }

        public ComplexObject build() {
            ComplexObject complexObject = new ComplexObject(name);
            complexObject.setX(x);
            complexObject.setY(y);
            complexObject.setZ(z);
            complexObject.setNotes(notes);
            complexObject.setActive(active);
            return complexObject;
        }
    }
}
