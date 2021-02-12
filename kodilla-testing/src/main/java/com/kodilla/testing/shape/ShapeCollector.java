package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
Circle circle = new Circle(4);
Square square = new Square(3);
Triangle triangle = new Triangle(3,4);

    ArrayList<Shape> list = new ArrayList<>();

    public void addFigure(Shape shape) {
        list.add(shape);
    }

    public void removeFigure(Shape shape) {
        list.remove(shape);
    }

    public void getFigure(int n) {
        list.get(n);
    }

    public String showFigures(){

       return circle.getShapeName() + ", " + square.getShapeName() + ", " + triangle.getShapeName();

    }
}
