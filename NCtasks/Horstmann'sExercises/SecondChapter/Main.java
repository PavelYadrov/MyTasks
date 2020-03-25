package com.exercises;

import com.exercises.ex5.Point;
import com.exercises.ex9.Car;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));


        try {
            //Fifth exercise
            System.out.println("Fifth exercise - write point location");
            Point p = new Point(Double.parseDouble(bf.readLine()), Double.parseDouble(bf.readLine())).translate(2, 2).scale(3);
            System.out.println(p);

            //Eighth exercise
            System.out.println("Eighth exercise - write origin mileage, fuel and efficiency");
            Car car = new Car(Double.parseDouble(bf.readLine()), Double.parseDouble(bf.readLine()), Double.parseDouble(bf.readLine()));
            car.drive(150);
            car.refill(3.4);
            System.out.println(car);
        }
        catch (IOException e){
            System.out.println("IOException");
            e.printStackTrace();
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
