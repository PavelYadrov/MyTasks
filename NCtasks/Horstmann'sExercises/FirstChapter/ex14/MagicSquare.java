package com.exercices.ex14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
/*
Write a program that reads a two-dimensional array of integers and determines whether it is a magic square (that is, whether the sum of all rows, all columns, and the diagonals is the same).
        Accept lines of input that you break up into individual integers, and stop when the user enters a blank line. */

public class MagicSquare {
    int n;
    private int[][] matrix;
    public MagicSquare(int size) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        n=size;
        this.matrix= new int[n][n];
        System.out.println("Fill the array with size "+n+"x"+n);
        for (int[] mas:matrix) {
            String check = bf.readLine();
            if ("".equals(check))  {
                System.out.println("end of InputStream");
                break;
            }
            String[] s = check.split("\\s+");
            int i=0;
            for (String number:s){
                mas[i]=Integer.parseInt(number);
                i++;
            }
        }

    }

    public void myPrint() {
        System.out.println("MagicSquare{" +
                "matrix=");
        for(int[] i:matrix ){
            System.out.println(Arrays.toString(i));
        }
    }

    public void magicalTest(){
        System.out.println("Is matrix magic?");
        int[] rows= new int[n];
        int[] columns = new int[n];
        int[] diagonals= new int[2];
        for (int i = 0; i < n; i++) {
            diagonals[0]+=matrix[i][i];
            diagonals[1]+=matrix[i][n-i-1];
            for (int j = 0; j < n; j++) {
                rows[i]+=matrix[i][j];
                columns[i]+=matrix[j][i];
            }
        }
        System.out.println(Arrays.toString(rows)+"   "+Arrays.toString(columns)+"    "+Arrays.toString(diagonals));
        if (Arrays.equals(rows, columns) && diagonals[0]==diagonals[1] && diagonals[0]==rows[0] ) {
            System.out.println("Yes, it is");
        }
        else System.out.println("Nope");
    }

}
