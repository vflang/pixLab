package com.company;

/**
 * Created by Veronica Lang on 10/4/2017.
 */
public class Circle {
    public double radius;

    public Circle(double r){
        radius = r;
    }
    public double diameter() {
        double d = radius * 2;
        return d;
    }
}
