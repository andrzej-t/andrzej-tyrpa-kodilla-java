package com.kodilla.testing.shape;

public class Circle implements Shape{
    double r;
    public Circle(double r) {
        this.r = r;
    }

    @Override
    public String getShapeName() {
        return "Circle";
    }

    @Override
    public double getField() {
        return Math.PI * r * r;
    }

    public double getR() {
        return r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                '}';
    }
}
