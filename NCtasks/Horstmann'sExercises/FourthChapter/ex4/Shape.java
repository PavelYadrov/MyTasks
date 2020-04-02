package com.exersices.ex4;

import com.exersices.ex1.Point;

public abstract class Shape {
    protected Point point;

    public Shape(Point point) {
        this.point = point;
    }
    public void moveBy(double dx, double dy){
        point.setX(point.getX()+dx);
        point.setY(point.getY()+dy);
    }
    public abstract Point getCenter();

    public abstract Shape clone();


}
