package com.pavelyadrov.mycollection;

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
     default void addMany(List<T> list, int n){
          for (int i = 0; i <n; i++) {
               int k = rand.nextInt(1000);
               int l = rand.nextInt(1000);
               list.add((T) new MyComplex(k,l));
          }
     }
     //only for List with MyComplex Objects
     //cuz i didn't have much time, sorry
      static double productivityCompare(int n){
          MyLinkedList<MyComplex> myLinkedList = new MyLinkedList<>();
          myLinkedList.addMany(n);
          LinkedList<MyComplex> linkedList = new LinkedList<MyComplex>();
          myLinkedList.addMany(linkedList,n);

          //add time Difference with "+n+" elements like MyLinkedList(Time)-LinkedList(Time)

           double myTime = System.nanoTime();
           myLinkedList.add(n/2,new MyComplex(11,1));
           myTime = System.nanoTime()-myTime;
           double linTime = System.nanoTime();
           linkedList.add(n/2,new MyComplex(11,1));
           linTime=System.nanoTime()-linTime;
           return myTime - linTime;

           //get time Difference with "+n+" elements like MyLinkedList(Time)-LinkedList(Time)
           /*double myTime = System.nanoTime();
           myLinkedList.get(n/2);
           myTime = System.nanoTime()-myTime;
           double linTime = System.nanoTime();
           linkedList.get(n/2);
           linTime=System.nanoTime()-linTime;
           return myTime-linTime;*/

           //set time Difference with "+n+" elements like MyLinkedList(Time)-LinkedList(Time)
           /*double myTime = System.nanoTime();
           myLinkedList.set(n/2,new MyComplex(1,1));
           myTime = System.nanoTime()-myTime;
           double linTime = System.nanoTime();
           linkedList.set(n/2,new MyComplex(1,1));
          linTime=System.nanoTime()-linTime;
           return myTime-linTime;*/

          //remove time Difference with "+n+" elements like MyLinkedList(Time)-LinkedList(Time)
        /*  double myTime = System.nanoTime();
          myLinkedList.remove(n/2);
          myTime =System.nanoTime()-myTime;
          double linTime = System.nanoTime();
          linkedList.remove(n/2);
          linTime=System.nanoTime()-linTime;
          return myTime-linTime;*/
     }

}
