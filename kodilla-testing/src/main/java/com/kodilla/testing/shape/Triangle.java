package com.kodilla.testing.shape;

public class Triangle implements Shape{

    //The base of the triangle
    double a;
    //The height of the triangle
    double h;

    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public double getField() {
        return  a * 0.5 * h;
    }

    public double getA() {
        return a;
    }

    public double getH() {
        return h;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", h=" + h +
                '}';
    }
}
