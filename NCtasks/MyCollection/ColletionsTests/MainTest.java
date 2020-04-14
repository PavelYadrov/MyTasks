package com.pavelyadrov;

import com.pavelyadrov.mycollection.CollectKeys;

import com.pavelyadrov.productivity.IProductivity;

import java.util.*;

public class MainTest {
    public static void main(String[] args) {
        //ArrayList and LinkedList

        double add = 0, get = 0, set = 0, remove = 0;
        /*for (int i = 0; i < 100; i++) {
            double[] d =IProductivity.arrayListAndLinked(100000);
            add+=d[0];
            get+=d[1];
            set+=d[2];
            remove+=d[3];

        }
        System.out.println("Simple operation time for Lists - "+ add/100+" "+get/100+" "+set/100+" "+remove/100);

         */
        //HashMap,HashSet and TreeSet
        add=0;
        remove=0;

        //use following example to define how fast is TreeSet working
        //new TreeSet<>((s1,s2)->s1.hashCode()-s2.hashCode())
        // Optionally u can use ur own compare feature but remember there is Object instance inside TreeSet
        for (int i = 0; i <100 ; i++) {
            double[] d=IProductivity.collections(new TreeSet<>((s1,s2)->s1.hashCode()-s2.hashCode()),100, CollectKeys.SET);
            add+=d[0];
            remove+=d[1];
        }
        System.out.println("Simple operation time for Sets - "+ add/100+" "+remove/100);

       int put = 0;
        get = 0;
        int replace = 0;
        remove = 0;

        //use following example to define how fast is TreeMap working
        //new TreeMap<>((s1,s2)->s1.hashCode()-s2.hashCode())
        // Optionally u can use ur own compare feature but remember there is Object instance inside TreeMap

        for (int i = 0; i < 100; i++) {
            double[] d = IProductivity.maps(new HashMap<>(),100);
            put += d[0];
            get += d[1];
            replace += d[2];
            remove += d[3];
        }
        System.out.println("Simple operation time for Maps - " + put / 100 + " " + get / 100+" "+replace / 100+" "+remove / 100);



    }
}
