package com.exercices;

import com.exercices.ex1.IntRepresentation;
import com.exercices.ex13.LotteryTicket;
import com.exercices.ex14.MagicSquare;
import com.exercices.ex2.Angle;
import com.exercices.ex3.MaxInt;
import com.exercices.ex6.Factorial;
import com.exercices.ex7.TwoInteger;
import com.exercices.ex7.TwoInteger;

import com.exercices.util.Utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        try {
            //First exercise
            System.out.println("First exercise - Write int val");
            IntRepresentation val = new IntRepresentation(Integer.parseInt(bf.readLine()));
            val.representationPrint();
            val.hexdecRep();

            //Second exercise
            System.out.println("\nSecond exercise - Write angle int");
            Angle angle = new Angle(Integer.parseInt(bf.readLine()));
            System.out.println(angle);


            //Third exercise
            System.out.println("\nThird exercise - Write 3 int values");
            MaxInt maxInt = new MaxInt(Integer.parseInt(bf.readLine()), Integer.parseInt(bf.readLine()), Integer.parseInt(bf.readLine()));
            System.out.println(maxInt + " largest is - " + maxInt.largest());

            //Fourth exercise
            //Static method from Utils Class
            System.out.println("\nFourth exercise");
            System.out.println(Utils.DoubleValues());

            //Fifth exercise
            // Condition: What happens when you cast a double to an int that is larger than the largest possible int value? Try it out.
            System.out.println("\nFifth exercise");
            double d = 111111111114234531.543;
            int i = (int) d;
            System.out.println(i);
            //It prints largest Integer value  which means information leakage


            //Sixth exercise
            System.out.println("\nSixth exercise - Write int number");
            Factorial factorial = new Factorial(Integer.parseInt(bf.readLine()));
            System.out.println(factorial.getFactorial());
            //Computing the factorial of 1000
            factorial.setN(1000);
            System.out.println(factorial.getFactorial());


            //Seventh exercise
            System.out.println("\nSeventh exercise - write two integers between 0 and 4294967295");
            TwoInteger twoInteger = new TwoInteger(bf.readLine(), bf.readLine());
            twoInteger.myPrint();


            //Eighth exercise
            System.out.println("\nEighth exercise - write your string");
            Utils.allSubStrings(bf.readLine()); //print all substrings with punctuation marks

            //Ninth exercise
            //Idk what to think of in this exercise
            System.out.println("\nNinth exercise");
            String s1 = new String("World");
            String s2 = "World";
            System.out.println(s1.equals(s2) + " - equals  ");
            System.out.print(s1 == s2);
            System.out.println(" - == ");


            //Tenth exercise
            //Random string from float in 36 base
            System.out.println("\nTenth exercise ");
            System.out.println(Long.toString(new Random(new Random().nextInt(1000)).nextLong(), 36));


            //Thirteenth exercise
            System.out.println("\nThirteenth exercise ");
            LotteryTicket lotteryTicket = new LotteryTicket();
            System.out.println(lotteryTicket);


            //Fourteenth exercise
            System.out.println("\nFourteenth exercise ");
            MagicSquare magicSquare = new MagicSquare(3);
            magicSquare.myPrint();
            magicSquare.magicalTest();
            
            //Fifteenth exercise
            //Static method from Utils Class
            System.out.println("\nFifteenth exercise ");
            System.out.println("Print for clarity");
            System.out.println(Utils.pascalsTriangle(6));
       
        }
        catch (IOException e){
            System.out.println("IOException");
            e.printStackTrace();
        }
        catch (Exception e){
            System.out.println("Another exception");
            e.printStackTrace();
        }

    }
}
