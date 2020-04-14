package com.pavelyadrov.productivity;

import com.pavelyadrov.mycollection.CollectKeys;
import com.pavelyadrov.mycollection.ILinkedList;
import com.pavelyadrov.mycollection.MyLinkedList;
import com.pavelyadrov.testclasses.MyComplex;

import java.util.*;

public interface IProductivity extends Comparable {

    static <T> void add(Collection<T> collection,int n){
        for (int i = 0; i < n; i++) {
            collection.add((T) new Object());
        }
    }

    static <K, V> void add(Map<K, V> list, int n) {
        for (int i = 0; i < n; i++) {
            list.put((K) new Object(), (V) new Object());
        }
    }

    static <T> double[] collections(Collection<T> collection, int n, CollectKeys key) {
        if (key== CollectKeys.SET) {
            add(collection, n);
            double[] res = new double[2];
            Object c = new Object();
            //ADD
            double myTime = System.nanoTime();
            collection.add((T) c);
            myTime = myTime - System.nanoTime();
            res[0] = -myTime;

            //REMOVE
            double myTime1 = System.nanoTime();
            collection.remove(c);
            myTime1 = myTime1 - System.nanoTime();
            res[1] = -myTime1;
            return res;
        }

        double[] res1 = new double[4]; //for standard collections
        double[] res2 = new double[4]; //for MyLinkedList

            ArrayList<MyComplex> arrayList = new ArrayList<>();
            add(arrayList, n);

            LinkedList<MyComplex> linkedList = new LinkedList<>();
            add(linkedList, n);

            MyLinkedList<MyComplex> myLinkedList = new MyLinkedList<>();
            myLinkedList.addMany(n);


            //ADD
            double myTime = System.nanoTime();
            arrayList.add(n / 2, new MyComplex(11, 1));
            myTime = System.nanoTime()-myTime;
            double linTime = System.nanoTime();
            linkedList.add(n / 2, new MyComplex(11, 1));
            linTime = System.nanoTime()-linTime;
            res1[0] = myTime - linTime;

            myTime = System.nanoTime();
            myLinkedList.add(n/2,new MyComplex(11,1));
            myTime = System.nanoTime()-myTime;
            linTime = System.nanoTime();
            linkedList.add(n/2,new MyComplex(11,1));
            linTime=System.nanoTime()-linTime;
            res2[0]=myTime - linTime;

            //GET
            double myTime1 = System.nanoTime();
            arrayList.get(n / 2);
            myTime1 = System.nanoTime()-myTime1;
            double linTime1 = System.nanoTime();
            linkedList.get(n / 2);
            linTime1= System.nanoTime()-linTime1;
            res1[1] = myTime1 - linTime1;

            myTime = System.nanoTime();
            myLinkedList.get(n/2);
            myTime = System.nanoTime()-myTime;
            linTime = System.nanoTime();
            linkedList.get(n/2);
            linTime=System.nanoTime()-linTime;
            res2[1]= myTime-linTime;

            //SET
            double myTime2 = System.nanoTime();
            arrayList.set(n / 2, new MyComplex(1, 1));
            myTime2 = System.nanoTime()-myTime2;
            double linTime2 = System.nanoTime();
            linkedList.set(n / 2, new MyComplex(1, 1));
            linTime2 = System.nanoTime()-linTime2;
            res1[2] = myTime2 - linTime2;

            myTime = System.nanoTime();
            myLinkedList.set(n/2,new MyComplex(1,1));
            myTime = System.nanoTime()-myTime;
            linTime = System.nanoTime();
            linkedList.set(n/2,new MyComplex(1,1));
            linTime=System.nanoTime()-linTime;
            res2[2]= myTime-linTime;

            //REMOVE
            double myTime3 = System.nanoTime();
            arrayList.remove(n / 2);
            myTime3 = System.nanoTime()-myTime3;
            double linTime3 = System.nanoTime();
            linkedList.remove(n / 2);
            linTime3 = System.nanoTime()-linTime3;
            res1[3] = myTime3 - linTime3;

            myTime = System.nanoTime();
            myLinkedList.remove(n/2);
            myTime =System.nanoTime()-myTime;
            linTime = System.nanoTime();
            linkedList.remove(n/2);
            linTime=System.nanoTime()-linTime;
            res2[3]= myTime-linTime;

            if (key==CollectKeys.MYLINKEDLIST){
                return res2;
            }
            else return res1;
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

}
