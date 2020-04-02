package com.exersices;

import com.exersices.ex1.Point;
import com.exersices.ex2.LabeledPoint;
import com.exersices.ex4.Circle;
import com.exersices.ex4.Line;
import com.exersices.ex4.Rectangle;
import com.exersices.ex4.Shape;
import com.exersices.ex6.DiscountedItem;
import com.exersices.ex6.Item;
import com.exersices.ex7.Colors;
import com.exersices.ex9_13.AllVariables;

import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException {

        //First three exercises
        System.out.println("\nFirst 3 exercises");
        Point p = new Point(3,4);
        LabeledPoint lp = new LabeledPoint("Red",1,2);
        Point lp2 = new LabeledPoint("ss",5,5);
        System.out.println("lp2.x and lp2.y - compile error");
        System.out.println("But inside LabeledPoint they are acceptable - see x1 and y1");

        //Fourth and Fifth exercises
        System.out.println("\nFourth and Fifth exercises");
        Shape circle = new Circle(new Point(3,4),4);
        Shape circle2 = circle.clone();
        System.out.println(circle.getCenter());
        Shape line = new Line(new Point(2,2),new Point(6,7));
        System.out.println(line.getCenter());
        Shape rectangle = new Rectangle(new Point(1,1),23,12);
        System.out.println(rectangle.getCenter());

        //Sixth exercise
        System.out.println("\nSixth exercise");
        Item x = new Item(124);
        DiscountedItem y = new DiscountedItem(124,33);
        DiscountedItem z = new DiscountedItem(124,34);
        System.out.println(x.equals(y)+ " "+x.equals(z)+" "+y.equals(z));

        //Seventh exercise
        System.out.println("\nSeventh exercise");
        System.out.println(Colors.getBlue());

        //Eighth exercise
        System.out.println("\nEighth exercise");
        //All methods from Class class that yield a string representation of the type represented by the Class object
        //works well with arrays, generic types, inner classes, and primitive types
        //for exmaple
        System.out.println(int.class.getName());
        System.out.println(int[].class.getName());
        List<Integer> list = new ArrayList<>();
        System.out.println(list.getClass().getName());

        //Ninth exercise
        System.out.println("\nNinth exercise");
        System.out.println(AllVariables.toString(new Circle(new Point(3,4),3)));

        //Tenth exercise
        System.out.println("\nTenth exercise");
        AllVariables.methodPrinter();

        //Eleventh exercise
        System.out.println("\nEleventh exercise");
        AllVariables.helloWorld();

        //Twelfth exercise
        System.out.println("\nTwelfth exercise");
        AllVariables.perfDifference();


        //Thirteenth exercise
        System.out.println("\nThirteenth exercise");
        System.out.println(AllVariables.table(Math.class.getMethod("sqrt", double.class),-5,10,2));
        System.out.println(AllVariables.table(Double.class.getMethod("toHexString", double.class),-5,10,2));
    }
}
