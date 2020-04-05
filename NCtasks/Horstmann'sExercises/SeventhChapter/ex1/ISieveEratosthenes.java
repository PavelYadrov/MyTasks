package com.exercises.ex1;

import java.util.BitSet;
import java.util.HashSet;
import java.util.Set;

public interface ISieveEratosthenes {

    //Exercise ONE
    static Set<Integer> primeNumbers(int n){
        Set<Integer> primeNumbers = new HashSet<>(n);
        Set<Integer> numbers = new HashSet<>();
        for (int i = 2; i < n+1; i++) { primeNumbers.add(i); }

        for(Integer number:primeNumbers){
            for(int current = (int)Math.pow(number,2); current<=n; current+=number){
                numbers.add(current);
            }
        }
        primeNumbers.removeAll(numbers);
        return primeNumbers;
    }

    static BitSet primeBS(int n){
        BitSet bs = new BitSet(n+1);
        bs.set(2,31);
        for(int i=2;i*i<n;i++){
            if(bs.get(i)) {
                for (int p=i*i;p<=n;p+=i) {
                    bs.set(p,false);
                }
            }
        }
        return bs;
    }
}
