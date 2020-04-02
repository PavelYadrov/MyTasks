package com.exersices.ex4;

import com.exersices.ex1.Point;

public class Circle extends Shape {
    private double radius;

    public Circle(Point point, double radius) {
        super(point);
        this.radius = radius;
    }

    @Override
    public Point getCenter() {
        return point;
}

    @Override
    public Circle clone() {
        return new Circle(new Point(point.getX(),point.getY()),radius);
    }
}
