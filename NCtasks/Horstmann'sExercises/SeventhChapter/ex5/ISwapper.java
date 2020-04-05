package com.exercises.ex5;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public interface ISwapper {
    static void swap(List<?> list, int i, int j){
        if (Arrays.toString(list.getClass().getInterfaces()).contains("RandomAccess")){ Collections.swap(list,i,j); }
        else {
            Object ok = list.get(i);
            Object ko = list.get(j);
            Object[] obj = list.toArray();
            obj[i]=ko;
            obj[j]=ok;
            list.clear();
            ((List) list).addAll(Arrays.asList(obj));

        }
    }
}

