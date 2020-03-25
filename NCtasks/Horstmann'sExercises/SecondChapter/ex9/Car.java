package com.exercises.ex9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Car {
    private double mileage;
    private final double origin;
    private double fuel;
    private double efficiency;
    private static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public Car(double mileage, double fuel,double efficiency) {
        this.fuel = fuel;
        this.origin = mileage;
        this.mileage = mileage;
        this.efficiency = efficiency;
    }

    public double drive(double miles) throws IOException {
        this.fuel-=miles/efficiency;
        if (this.fuel<=0) {
            System.out.println("You cant reach that far, please get refilled");
            return 0.0;
        }
        return this.mileage+=miles;
    }

    @Override
    public String toString() {
        return "Car{" +
                "mileage=" + mileage +
                ", fuel=" + fuel +
                ", efficiency=" + efficiency +
                '}';
    }

    public void refill(double tanks){ this.fuel+=tanks; }

    public double distance(){ return mileage-origin; }

    public double fuelLevel(){ return fuel; }

}
