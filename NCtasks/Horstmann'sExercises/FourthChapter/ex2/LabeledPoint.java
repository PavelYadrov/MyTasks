package com.exersices.ex2;

import com.exersices.ex1.Point;

public class LabeledPoint extends Point {
    private String label;
    private double x1 = x;
    private double y1 = y;

    public LabeledPoint(String label,double x, double y) {
        super(x, y);
        this.label=label;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return super.toString() +
                " { label='" + label + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if(!super.equals(o)) return false;
        LabeledPoint that = (LabeledPoint) o;
        return label.equals(that.label);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + label.hashCode();
        return result;
    }

}
