package com.exercices.util;

import java.util.Arrays;

public class Utils {
    public static String DoubleValues() {
        return "Smallest positive double value - "+Math.nextUp(0)+" Double max value - "+Double.MAX_VALUE;
    }
    public static void allSubStrings(String string){
        System.out.println(Arrays.toString(string.split("\\s+")));
    }
}
