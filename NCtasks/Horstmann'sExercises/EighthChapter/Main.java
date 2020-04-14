package com.exercises;

import com.exercises.ex7.Tokens;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Tokens tokens = new Tokens("B:\\myNCprojects\\HorstmanExercises\\Tolstoy Leo. War and Peace.txt");

        //Seventh exercise
        System.out.println("\nSeventh Exercise");
        System.out.println(tokens.getHundred());

        //Eighth exercise
        System.out.println("\nEighth Exercise");
        List<Object> bh = new ArrayList<>();
        IntStream.range(100,10000).mapToObj(Optional::of).map(op -> op.filter(x -> x % 2 == 0))
                .flatMap(Stream::of).forEach(s->s.ifPresent(bh::add));
        System.out.println(bh);

        //Ninth exercise
        System.out.println("\nNinth Exercise");
        System.out.println(tokens.getFive());

        //Tenth exercise
        System.out.println("\nTenth Exercise");
        System.out.println(tokens.average());

        //Eleventh exercise
        System.out.println("\nEleventh Exercise");
        System.out.println(tokens.maxLength());


       //Fifteenth exercise
        System.out.println("\nFifteenth Exercise");
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
        System.out.println("\nSixteenth Exercise");
        System.out.println(Tokens.primes());

        //Seventeenth exercise
        System.out.println("\nSeventeenth Exercise");
        System.out.println(tokens.fiveHundredStrings());




    }
}
