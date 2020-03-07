package com.tasks.pavelyadrov;

import java.util.Arrays;

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        v1 = new MyPoint(x1, y1);
        v2 = new MyPoint(x2, y2);
        v3 = new MyPoint(x3, y3);

    }

    @Override
    public String toString() {
        return "MyTriangle{" + "v1=" + Arrays.toString(v1.getXY()) + ", v2=" + Arrays.toString(v2.getXY()) + ", v3=" + Arrays.toString(v3.getXY()) + '}';
    }

    public double getPerimeter() {
        double firstSide = v1.distance(v2);
        double secondSide = v2.distance(v3);
        double thirdSide = v3.distance(v1);
        return firstSide + secondSide + thirdSide;
    }
    public String getType(){
        String type = null;
        double firstSide = v1.distance(v2);
        double secondSide = v2.distance(v3);
        double thirdSide = v3.distance(v1);
        if (firstSide==secondSide && secondSide==thirdSide) {
            type = "Equilateral";
        }
        else if (firstSide==secondSide || secondSide==thirdSide || thirdSide==firstSide) {
            type = "Isosceles";
        }
        else type = "Scalene";
        return type;
    }
}