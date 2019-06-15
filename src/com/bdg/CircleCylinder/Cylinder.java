package com.bdg.CircleCylinder;

public class Cylinder extends Circle {
    private double height=1.0;
    public Cylinder() {

    }
    public Cylinder(double radius) {
        this.radius=radius;
    }
    public Cylinder(double radius, double height) {
        super(radius);
        this.height=height;

    }
    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }
    public double getHeight(){
        return this.height;
    }
    public void setHeight(double height){
        this.height=height;
    }
    public double getVolume(){
        return Math.PI * Math.pow(radius, 2) * height;
    }

    public String ToString() {
        return "Cylinder[ radius =" + this.radius + ", color = " + this.color + " height " + this.height + " ]";
    }
}

