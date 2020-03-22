package com.exercices.ex13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/*Write a program that prints a lottery combination, picking six distinct numbers between 1 and 49.
 To pick six distinct numbers, start with an array list filled with 1...49.
 Pick a random index and remove the element. Repeat six times. Print the result in sorted order.*/

public class LotteryTicket {
    private ArrayList<Integer> number = new ArrayList<>();
    private ArrayList<Integer> numbers = new ArrayList<>();

    public LotteryTicket(){
        numbers.add(0,0);
        for (int i = 1; i <=49; i++) {
            numbers.add(i,Integer.valueOf(i));
        }
        int n=49;
        for (int i = 0; i < 6; i++) {
            int k=new Random().nextInt(n)+1;
            number.add(i,numbers.get(k));
            n--;
            numbers.remove(k);
        }
        Collections.sort(number);
    }
    @Override
    public String toString() {
        return "LotteryTicket{" +
                "number=" + number+
                '}';
    }
}
