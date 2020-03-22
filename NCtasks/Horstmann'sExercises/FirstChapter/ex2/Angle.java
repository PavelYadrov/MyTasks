package com.exercices.ex2;

public class Angle {
    private int angle;

    @Override
    public String toString() {
        return "Angle{" +
                "angle=" + angle +
                '}';
    }

    public Angle(int angle){
       this.angle=Math.floorMod(angle,360);
        //optional calculations
       /*this.angle = angle%360;
        if (angle<0) this.angle=360+angle%360;*/
    }
}
