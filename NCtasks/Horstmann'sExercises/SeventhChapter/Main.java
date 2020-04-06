package com.exercises;

import com.exercises.ex1.ISieveEratosthenes;
import com.exercises.ex10.DiAlgorithm;
import com.exercises.ex5.ISwapper;
import com.exercises.ex6.IMap;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //First Exercise
        System.out.println("\nFirst exercise");
        System.out.println(ISieveEratosthenes.primeNumbers(30));
        System.out.println(ISieveEratosthenes.primeBS(30));

        //Fifth Exercise
        System.out.println("\nFifth exercise");
        List<String> list = new LinkedList<>();
        list.add("solo");
        list.add("ball");
        list.add("soul");
        list.add("cold");
        ISwapper.swap(list,0,3);
        System.out.println(list);

        //Sixth exersice
        //static <T> void method(Map<String, Set<T>> map)
        //i cannot use anything instead of Set<T>

        //Tenth exercise
        System.out.println("\nTenth Exercise");
        DiAlgorithm dia = new DiAlgorithm(5);
        List<List<DiAlgorithm.Neighbor>> map = new ArrayList<List<DiAlgorithm.Neighbor>>();
        for (int i = 0; i < 5; i++) {
            List<DiAlgorithm.Neighbor> ss = new ArrayList<>();
            map.add(ss);
        }
        //input example
        map.get(0).add(new DiAlgorithm.Neighbor(1, 12));
        map.get(0).add(new DiAlgorithm.Neighbor(2, 6));
        map.get(2).add(new DiAlgorithm.Neighbor(1, 3));
        map.get(2).add(new DiAlgorithm.Neighbor(3, 4));
        map.get(2).add(new DiAlgorithm.Neighbor(4, 2));

        dia.algorithm(map,0);
    }
        //Seventh Exercise
        System.out.println("\nSeventh Exercise");
        WarAndPeace wp = new WarAndPeace("B:\\myNCprojects\\HorstmanExercises\\Tolstoy Leo. War and Peace.txt");
        wp.algorithm();
       wp.answer();
}
