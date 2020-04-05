package com.pavelyadrov.mycollection;

import com.pavelyadrov.testclasses.Circle;
import com.pavelyadrov.testclasses.MyComplex;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        /*MyLinkedList<MyComplex> mycol = new MyLinkedList<>();
        mycol.add(new MyComplex(3,5));
        mycol.add(new MyComplex(2,1));
        mycol.add(new MyComplex(5,3));
        System.out.println(mycol+ " toString test");
        mycol.add(2,new MyComplex(5,5));
        System.out.println(mycol+" index add test");
        mycol.set(0,new MyComplex(1,1));
        System.out.println(mycol+" set Test");

        //add all and constructors
        MyLinkedList<MyComplex> mycol1 = new MyLinkedList<>(mycol);
        mycol.addAll(mycol1);
        System.out.println(mycol);
        //getSequence
        System.out.println(Arrays.toString(mycol.getSequence(2, 3)));
        //toArray tests
        System.out.println(mycol.toArray().getClass());
        System.out.println(mycol.toArray(new MyComplex[0]).getClass());
        //check simple actions
        mycol.get(3);
        mycol.clear();
        mycol1.remove(1);
        mycol1.indexOf(new MyComplex(2,2));
        //well they worked correctly after all
*/
        //Compare MyLinkedList and LinkedList
        double res=0;
        for (int i=0;i<100;i++) {
            res+=ILinkedList.productivityCompare(100000);
        }
        System.out.println(res/100);

    }
}
