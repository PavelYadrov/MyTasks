package com.task6.pavelyadrov;

public enum TriangleType {
    EQUILATERAL("Equilateral"),ISOSCELES("Isosceles"),SCALENE("Scalene");
    private String name;
    TriangleType(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }
}
