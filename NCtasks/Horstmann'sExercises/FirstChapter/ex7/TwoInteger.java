package com.exercices.ex7;
/*Write a program that reads in two integers between 0 and 4294967295, stores them in int variables, and computes and displays their unsigned sum, difference, product, quotient, and remainder.
        Do not convert them to long values*/

import java.math.BigInteger;

public class TwoInteger {
    private int first;
    private int second;

    public TwoInteger(String first, String second) {
        this.first = Integer.parseUnsignedInt(first);
        this.second = Integer.parseUnsignedInt(second);
    }

    public void myPrint() {
        System.out.println((Integer.toUnsignedLong(first) + Integer.toUnsignedLong(second))+ " - sum");
        System.out.println((Integer.toUnsignedLong(first) - Integer.toUnsignedLong(second)) +" - difference");
        System.out.println((Integer.toUnsignedLong(first) * Integer.toUnsignedLong(second)) + " - product");
        System.out.println((Integer.toUnsignedLong(first) / Integer.toUnsignedLong(second)) + " - quotient");
        System.out.println((Integer.toUnsignedLong(first) % Integer.toUnsignedLong(second)) + " - remainder");
    }

    public long getFirst() {
        return Integer.toUnsignedLong(first);
    }

    public long getSecond() {
        return Integer.toUnsignedLong(second);
    }
}


