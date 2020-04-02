package com.exersices.ex9_13;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public interface AllVariables {

    //Ninth Exercise
    static String toString(Object obj) {
        Class<?> cl = obj.getClass();
        StringBuilder stringBuilder = new StringBuilder();
        while (cl != null) {
            try {
                for (Field f : cl.getDeclaredFields()) {
                    f.setAccessible(true);
                    Object value = f.get(obj);
                    stringBuilder.append(f.getName()).append(":").append(value).append(" ");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            cl = cl.getSuperclass();
        }
        return stringBuilder.toString();
    }


    //Tenth exercise
    static void methodPrinter() {
        Class<?> cl = int[].class;
        while (cl != null) {

            try {
                for (Method m : cl.getDeclaredMethods()) {
                    System.out.println(
                            Modifier.toString(m.getModifiers()) + " " +
                                    m.getReturnType().getCanonicalName() + " " +
                                    m.getName() +
                                    Arrays.toString(m.getParameters()));
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
            cl = cl.getSuperclass();
        }
    }



    //Eleventh exercise
    static void helloWorld() {
        try {
            Field f = Class.forName("java.lang.System").getField("out");
            Object value = f.get(Class.forName("java.lang.System"));
            Method m = value.getClass().getMethod("println", String.class);
            m.invoke(value, "Hello World!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //Twelfth exercise
    static void perfDifference(){
        double t1=System.nanoTime();
        helloWorld();
        t1 = System.nanoTime()-t1;
        System.out.println("Reflection call time work - "+ t1);
        double t2=System.nanoTime();
        System.out.println("Hello World!");
        t2=System.nanoTime()-t2;
        System.out.println("Standard call time work - " +t2);

    }

    //Thirteenth exercise
    static List<Double> table(Method method, double lower, double upper, double step){
        List<Double> results = new ArrayList<>();
        double current=lower;
        try {
            while (current <= upper) {
                results.add((Double) method.invoke(null, current));
                current+=step;
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return results;
    }
}



