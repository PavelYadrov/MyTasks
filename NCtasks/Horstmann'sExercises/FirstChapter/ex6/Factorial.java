package com.exercices.ex6;

/*Write a program that computes the factorial n! = 1 ? 2 ?  . . .  ? n, using BigInteger.
        Compute the factorial of 1000.*/

import java.math.BigInteger;

public class Factorial {
    private int n;

    public Factorial(int n) {
        this.n = n;
    }
    public BigInteger getFactorial(){
        BigInteger bigInteger = new BigInteger("1");
        for (int i = 1; i <=n ; i++) {
            bigInteger = bigInteger.multiply(BigInteger.valueOf(i));
        }
        return bigInteger;
    }

    public void setN(int n) {
        this.n = n;
    }
}
