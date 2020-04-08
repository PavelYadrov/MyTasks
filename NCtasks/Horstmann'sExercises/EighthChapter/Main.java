package com.exercises;

import com.exercises.ex7.Tokens;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //TEST EVERYTHING APART
        //THERE IS ONLY 1 STREAM FOR ALL CLASSES AND IT MAY CAUSE IllegalStateException FOR GROUP TEST

        Tokens tokens = new Tokens("B:\\myNCprojects\\HorstmanExercises\\Tolstoy Leo. War and Peace.txt");
        
        //Seventh exercise
        System.out.println(tokens.getHundred());

        //Ninth exercise
        System.out.println(tokens.getFive());

        //Tenth exercise
        System.out.println(tokens.average());

        //Eleventh exercise
        System.out.println(tokens.maxLength());


       //Fifteenth exercise
        List<Double> doubleList= new ArrayList<>();
        doubleList.add(3.2);
        doubleList.add(2.3);
        doubleList.add(4.65);
        doubleList.add(123.3);
        doubleList.add(9.3412);
        doubleList.add(78.543);
        doubleList.add(387.3);
        doubleList.add(3.0);
        doubleList.add(4.0);
        doubleList.add(5.0);
        double average = doubleList.stream().reduce((s1,s2)-> (s1+s2)/2).orElse(0.0);
        System.out.println(average);
        
        //Sixteenth exercise
        public static Set<BigInteger> primes(){
        return Stream.iterate(BigInteger.probablePrime(165, new Random()), n-> n.add(BigInteger.TWO))
                .parallel().filter(num->num.isProbablePrime(1)).limit(500).collect(Collectors.toSet());
    }
       
        //Seventeenth exercise
        System.out.println(tokens.fiveHundredStrings());



    }
}
