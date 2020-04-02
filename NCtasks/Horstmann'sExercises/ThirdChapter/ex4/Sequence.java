package com.exercises.ex4;

import java.util.Arrays;
import java.util.function.BiFunction;

public class Sequence implements IntSequence{
    private Object[] sequence;

    public Sequence(Object[] sequence) {
        this.sequence = sequence;
    }

    @Override
    public String toString() {
        return "Sequence{" +
                "sequence=" + Arrays.toString(sequence) +
                '}';

    }
    public Sequence() {
    }
}
