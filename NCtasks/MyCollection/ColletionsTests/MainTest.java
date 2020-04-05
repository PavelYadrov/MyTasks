package com.pavelyadrov;

import com.pavelyadrov.productivity.IProductivity;
import com.sun.source.tree.Tree;

import java.util.*;

public class MainTest {
    public static void main(String[] args) {
        //ArrayList and LinkedList
        double add = 0, get = 0, set = 0, remove = 0;
        for (int i = 0; i < 100; i++) {
            double[] d =IProductivity.arrayListAndLinked(100000);
            add+=d[0];
            get+=d[1];
            set+=d[2];
            remove+=d[3];
        };
        System.out.println("Simple operation time for Lists - "+ add/100+" "+get/100+" "+set/100+" "+remove/100);
        /*//HashMap,HashSet and TreeSet
        add=0;
        remove=0;
        for (int i = 0; i <100 ; i++) {
            double[] d=IProductivity.sets(new TreeSet<String>(),10000);
            add+=d[0];
            remove+=d[1];
        }
        System.out.println("Simple operation time for Sets - "+ add/100+" "+remove/100);

        int put = 0;
        get = 0;
        int replace = 0;
        remove = 0;
        for (int i = 0; i < 100; i++) {
            double[] d = IProductivity.maps(new TreeMap<Integer,String>(),10000);
            put += d[0];
            get += d[1];
            replace += d[2];
            remove += d[3];
        }
        System.out.println("Simple operation time for Maps - " + put / 100 + " " + get / 100+" "+replace / 100+" "+remove / 100);

         */
    }
}

