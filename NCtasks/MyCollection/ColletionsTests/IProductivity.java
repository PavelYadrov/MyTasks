package com.pavelyadrov.productivity;

import com.pavelyadrov.mycollection.MyLinkedList;
import com.pavelyadrov.testclasses.MyComplex;

import java.util.*;

public interface IProductivity extends Comparable {
    static <T> void add(List<T> list, int n) {
        for (int i = 0; i < n; i++) {
            list.add((T) new Object());
        }
    }

    static <T> void add(Set<T> list, int n) {
        for (int i = 0; i < n; i++) {
            list.add((T) new Object());
        }
    }

    static <K, V> void add(Map<K, V> list, int n) {
        for (int i = 0; i < n; i++) {
            list.put((K) new Object(), (V) new Object());
        }
    }

    static void addTree(TreeSet<String> list, int n) {
        for (int i = 0; i < n; i++) {
            list.add(new String("ya tyta"));
        }
    }

    static void addMap(Map<Integer, String> list, int n) {
        for (int i = 0; i < n; i++) {
            list.put(Integer.valueOf(i), new String("yay"));
        }
    }
    static double[] arrayListAndLinked(int n) {
        double[] res = new double[4];
        ArrayList<Object> arrayList = new ArrayList<>();
        add(arrayList, n);
        LinkedList<Object> linkedList = new LinkedList<>();
        add(linkedList, n);
        //ADD
        double myTime = System.nanoTime();
        arrayList.add(n / 2, new MyComplex(11, 1));
        myTime = System.nanoTime()-myTime;
        double linTime = System.nanoTime();
        linkedList.add(n / 2, new MyComplex(11, 1));
        linTime = System.nanoTime()-linTime;
        res[0] = myTime - linTime;

        //GET
        double myTime1 = System.nanoTime();
        arrayList.get(n / 2);
        myTime1 = System.nanoTime()-myTime1;
        double linTime1 = System.nanoTime();
        linkedList.get(n / 2);
        linTime1= System.nanoTime()-linTime1;
        res[1] = myTime1 - linTime1;

        //SET
        double myTime2 = System.nanoTime();
        arrayList.set(n / 2, new MyComplex(1, 1));
        myTime2 = System.nanoTime()-myTime2;
        double linTime2 = System.nanoTime();
        linkedList.set(n / 2, new MyComplex(1, 1));
        linTime2 = System.nanoTime()-linTime2;
        res[2] = myTime2 - linTime2;

        //REMOVE
        double myTime3 = System.nanoTime();
        arrayList.remove(n / 2);
        myTime3 = System.nanoTime()-myTime3;
        double linTime3 = System.nanoTime();
        linkedList.remove(n / 2);
        linTime3 = System.nanoTime()-linTime3;
        res[3] = myTime3 - linTime3;
        return res;
    }

    static <T> double[] sets(Set<T> set, int n) {
        add(set, n);
        double[] res = new double[2];
        Set<T> ns = set;
        Object c = new Object();
        //ADD
        double myTime = System.nanoTime();
        ns.add((T) c);
        myTime = myTime - System.nanoTime();
        res[0] = -myTime;

        //REMOVE
        double myTime1 = System.nanoTime();
        ns.remove(c);
        myTime1 = myTime1 - System.nanoTime();
        res[1] = -myTime1;
        return res;
    }

    static double[] sets(TreeSet<String> set, int n) {
        addTree(set, n);
        double[] res = new double[2];
        TreeSet<String> ns = set;
        String c = new String("SOS");
        //ADD
        double myTime = System.nanoTime();
        ns.add(c);
        myTime = myTime - System.nanoTime();
        res[0] = -myTime;

        //REMOVE
        double myTime1 = System.nanoTime();
        ns.remove(c);
        myTime1 = myTime1 - System.nanoTime();
        res[1] = -myTime1;
        return res;
    }

    static <K, V> double[] maps(Map<K, V> map, int n) {
        add(map, n);
        double[] res = new double[4];
        Map<K, V> ns = map;
        Object c1 = new Object();
        Object c2 = new Object();

        //ADD
        double myTime = System.nanoTime();
        ns.put((K) c1, (V) c2);
        myTime = myTime - System.nanoTime();
        res[0] = -myTime;

        //GET
        double myTime1 = System.nanoTime();
        ns.get((K) c1);
        myTime1 = myTime1 - System.nanoTime();
        res[1] = -myTime1;

        //REPLACE
        double myTime2 = System.nanoTime();
        ns.replace((K) c1, (V) c2, (V) new Object());
        myTime2 = myTime2 - System.nanoTime();
        res[2] = -myTime2;

        //REMOVE
        double myTime3 = System.nanoTime();
        ns.remove((K) c1, (V) c2);
        myTime3 = myTime3 - System.nanoTime();
        res[3] = -myTime3;
        return res;
    }

    static <K, V> double[] maps(TreeMap<Integer, String> map, int n) {
        addMap(map, n);
        double[] res = new double[4];
        Map<Integer, String> ns = map;
        Integer c1 = new Integer(3);
        String c2 = new String("yays");

        //ADD
        double myTime = System.nanoTime();
        ns.put(c1, c2);
        myTime = myTime - System.nanoTime();
        res[0] = -myTime;

        //GET
        double myTime1 = System.nanoTime();
        ns.get(c1);
        myTime1 = myTime1 - System.nanoTime();
        res[1] = -myTime1;

        //REPLACE
        double myTime2 = System.nanoTime();
        ns.replace(c1, c2, "new Object()");
        myTime2 = myTime2 - System.nanoTime();
        res[2] = -myTime2;

        //REMOVE
        double myTime3 = System.nanoTime();
        ns.remove(c1, c2);
        myTime3 = myTime3 - System.nanoTime();
        res[3] = -myTime3;
        return res;


    }
}
