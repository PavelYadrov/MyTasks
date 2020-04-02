package com.exersices.ex4;

import com.exersices.ex1.Point;

public class Line extends Shape {
    private Point to;

    public Line(Point from, Point to) {
        super(from);
        this.to = to;
    }

    @Override
    public Point getCenter() {
        return new Point((point.getX()+to.getX())/2,(point.getY()+to.getY())/2);
    }

    @Override
    public Line clone() {
        return new Line(new Point(point.getX(),point.getY()),new Point(to.getX(),to.getY()));
    }
}
