package com.exercises.ex8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public interface ICollectionsSort {
    static void luckySort(ArrayList<String> strings, Comparator<String> comp){
        boolean cont = true;
        int iteration = 0;
        while (cont){
            iteration++;
            ArrayList<String> str = new ArrayList<>(strings);
            str.sort(comp);
            if (str.equals(strings)){
                cont=false;
                strings.add(0,Integer.toString(iteration));
            }
            else Collections.shuffle(strings);
        }
    }

}
