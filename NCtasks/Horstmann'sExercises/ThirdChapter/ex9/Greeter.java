package com.exercises.ex9;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Greeter implements Runnable {
    private int n;
    private String target;

    public Greeter(int n, String target) {
        this.n = n;
        this.target = target;
    }

    @Override
    public void run() {
        for (int i = 0; i < n; i++) {
            //Delay for clarity
            try {
                TimeUnit.MILLISECONDS.sleep(new Random().nextInt(300));
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            System.out.println("Hello, "+target);
        }

    }
}
