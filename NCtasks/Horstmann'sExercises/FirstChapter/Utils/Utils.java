package com.exercices.util;

import java.util.Arrays;

public class Utils {
    // Exercise 4
    public static String DoubleValues() {
        return "Smallest positive double value - "+Math.nextUp(0)+" Double max value - "+Double.MAX_VALUE;
    }
   //Exercise 8
    public static void allSubStrings(String string){
        System.out.println(Arrays.toString(string.split("\\s+")));
    }
    //Exersice 15
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    //Exrcise 15
        public static ArrayList<ArrayList<Integer>> pascalsTriangle(int n){
        ArrayList<ArrayList<Integer>> pascalsTriangle = new ArrayList<>();
        int count=0;
        while (n>=count){
            ArrayList<Integer> coeffs = new ArrayList<>();
            for (int i = 0; i <=count ; i++) {
                coeffs.add(i,factorial(count)/(factorial(i)*factorial(count-i)));
            }
            System.out.println(coeffs);
            pascalsTriangle.add(count,coeffs);
            count++;
        }
            System.out.println("ArrayList inside ArrayList below");
        return pascalsTriangle;
    }
    
    //Exercise 16
     public static double average(double... values){
        double result =0.0;
        for(double val:values){
            result+=val;
        }
        return result/values.length;
    }
    
    //Exercise 16
    public static double average(String values){
        String[] strings = values.split("\\s+");
        double[] numbers = new double[strings.length];
        for (int i = 0; i < strings.length; i++) {
            numbers[i]=Double.parseDouble(strings[i]);
        }
        double result =0.0;
        for(double val:numbers){
            result+=val;
        }
        return result/numbers.length;
    }
    
}
