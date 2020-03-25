package com.exercises.ex5;

public class Point {
    private double x=0.0;
    private double y=0.0;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Point translate(double x,double y){ return new Point(this.x+x,this.y+y); }

    public Point scale(double scale) {return new Point(this.x*scale,this.y*scale); }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
