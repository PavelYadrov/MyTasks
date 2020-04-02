package com.exercises.ex10;

import java.util.Arrays;
import java.util.stream.Stream;

public interface ITasks extends Runnable {
    public static void runTogether(Runnable... tasks){
        for(Runnable runnable:tasks){
            new Thread(runnable).start();
        }
    }
    public static void runInOrder(Runnable... tasks){
        for(Runnable runnable:tasks){
            runnable.run();
        }
    }
}
