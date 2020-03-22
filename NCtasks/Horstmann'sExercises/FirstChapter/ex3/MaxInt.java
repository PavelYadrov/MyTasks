package com.exercices.ex3;
 /*Using only the conditional operator, write a program that reads three integers and prints the largest.
         Repeat with Math.max.*/
public class MaxInt {
    private int first;
    private int second;
    private int third;

    public MaxInt(int first, int second, int third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }
    public int largest(){
        return Math.max(Math.max(first,second),Math.max(second,third));
        //Solution with conditional operator
        //return first>second ? first>third ? first:third:second>third ? second:third;
    }

     @Override
     public String toString() {
         return "our 3 int values - "+
                 "first=" + first +
                 ", second=" + second +
                 ", third=" + third ;
     }
 }
