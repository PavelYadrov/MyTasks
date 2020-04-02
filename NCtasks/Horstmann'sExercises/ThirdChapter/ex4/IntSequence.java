package com.exercises.ex4;

import java.awt.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public interface IntSequence {
   static IntSequence of(Object... sq){
       return new Sequence(sq);
   }


   //Fifth exercise
   static void constant(int i){
       Stream.generate(() -> i).forEach(constant -> System.out.println(constant));
   }
}
