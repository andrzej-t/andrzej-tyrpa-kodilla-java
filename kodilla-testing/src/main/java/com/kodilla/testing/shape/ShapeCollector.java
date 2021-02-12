package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    ArrayList<Shape> list = new ArrayList<>();

    public void addFigure(Shape shape) {
        list.add(shape);
    }

    public void removeFigure(Shape shape) {
        list.remove(shape);
    }

    public String getFigure(int n) {
        return list.get(n).getShapeName();
    }

    public String showFigures(){
     return list.get(0).getShapeName() + ", " + list.get(1).getShapeName() + ", " + list.get(2).getShapeName();
    }
}
