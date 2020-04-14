package com.pavelyadrov.mycollection;

import com.pavelyadrov.productivity.IProductivity;
import com.pavelyadrov.testclasses.MyComplex;

import java.util.*;

public interface ILinkedList<T> extends Iterable<T> {
     Random rand = new Random();

     Iterator<T> iterator();

     void add(T element);

     void add(int index, T element);

     void clear();

     T get(int index);

     Object[] getSequence(int index,int seqSize);

     int indexOf(T element);

     T remove(int index);

     T set(int index, T element);

     int size();

     Object[] toArray();

     <E> E[] toArray(E[] a);

     String toString();

     void addAll(int index, MyLinkedList<? extends T> c);

     void addAll(MyLinkedList<? extends T> c);

     default void addMany(int n){
          for (int i = 0; i < n; i++) {
               int k = rand.nextInt(1000);
               int l = rand.nextInt(1000);
               this.add((T) new MyComplex(k,l));
          }
     }

     //Compare method
      static void productivityCompare(int n){
          IProductivity.collections(new ArrayList<>(),n,CollectKeys.MYLINKEDLIST);
     }
}

