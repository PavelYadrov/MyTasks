package com.exercises;

import com.exercises.ex10.ITasks;
import com.exercises.ex11.IFilePath;
import com.exercises.ex8.ICollectionsSort;
import com.exercises.ex9.Greeter;

import java.io.File;
import java.io.FilenameFilter;
import java.util.*;


public class Main {
    public static void main(String[] args)  {

        //First ercise
        System.out.println("First exercise");
        Measurable[] empls = new Measurable[]{
                new Employee("Peter Parker",250),
                new Employee("John Jameson",1200),
                new Employee("Eddie Brook", 150)
        } ;
        System.out.println(Measurable.average(empls));

        //Second exercise
        System.out.println("\nSecond exercise");
        System.out.println(Measurable.largest(empls));

        //Third exercise
        System.out.println("\nThird exercise - superTypes");
        System.out.println("String has 3 superTypes - java.io.Serializable, Comparable<String>, CharSequence");
        System.out.println("Scanner has 2 superTypes - Iterator<String>, Closeable");
        System.out.println("ImageOutputStream has 2 superTypes - ImageInputStream, DataOutput ");


        //Fourth exercise
        System.out.println("\nFourth exercise");
        IntSequence seq = IntSequence.of(1,2,3,4,5);
        System.out.println(seq);

        //Fifth exercise
        System.out.println("\nFifth exercise");
        //IntSequence.constant(3);

        //Eighth exercise
        System.out.println("\nEighth exercise");
        ArrayList<String> strings = new ArrayList<String>(Arrays.asList("DADDYA ", "MAXON", "LEGIONER", "SOMEONE ELSE","NIO"));
        System.out.println(strings);
        CollectionsSort.luckySort(strings,(t1, t2)->t1.length()-t2.length());
        System.out.println("First value is the number of the last iteration ");
        System.out.println(strings);

        //Ninth exercise
        System.out.println("\nNinth exercise");
        Runnable great1 = new Greeter(30,"Pete");
        Runnable great2 = new Greeter(20,"Max");
        Thread tread1 = new Thread(great1);
        Thread tread2 = new Thread(great2);
        tread1.start();
        tread2.start();

        //Tenth exercise
        System.out.println("\nTenth exercise - Delay for clarity");
        ITasks.runTogether(new Greeter(20,"Pete"),new Greeter(20,"Maximilian"),new Greeter(20,"mr.Breakfast"));
        ITasks.runInOrder(new Greeter(20,"Pete"),new Greeter(20,"Maximilian"),new Greeter(20,"mr.Breakfast"));




        //Eleventh exercise
        System.out.println("\nEleventh exercise");
        System.out.println(Arrays.toString(IFilePath.allPathes("B://myNCprojects//HorstmanExercises//FirstChapter", file -> file.isDirectory())));
        System.out.println(Arrays.toString(IFilePath.allPathes(new File("B://myNCprojects//HorstmanExercises"), File::isDirectory)));



        //Twelfth exercise
        System.out.println("\nTwelfth exercise");
        System.out.println(Arrays.toString(IFilePath.allNames("B://çàãðóçê", (file,name)-> name.toLowerCase().endsWith(".zip"))));



        //Thirteenth exercise
        //Preparation before exercise - gathering directions and files
        System.out.println("\nThirteenth exercise");
        List<File> fils = new ArrayList<>();
        fils.addAll(Arrays.asList(IFilePath.allNames("B://Gothic 3, (file,name)-> name.toLowerCase().endsWith(".zip"))));
        fils.addAll(Arrays.asList(IFilePath.allNames("B://Gothic 3//Gothic 3 mod's//Gothic 3 mod's", (file,name)-> name.toLowerCase().endsWith(".exe"))));
        fils.addAll(Arrays.asList(IFilePath.allPathes("B://Gothic 3//Gothic 3 mod's//Gothic 3 mod's", file -> file.isDirectory())));
        fils.addAll(Arrays.asList(IFilePath.allPathes("B://Gothic 3//", file -> file.isDirectory())));
        Collections.shuffle(fils);
        System.out.println(fils);
        ///Execution
        System.out.println(IFilePath.mySort(fils,(File1,File2) ->{
            if (File1.isDirectory() && !File2.isDirectory()) return -1;
            if (File2.isDirectory() && !File1.isDirectory()) return 1;
            else return File1.compareTo(File2);
        }));

 
        //Fourteenth exercise
        System.out.println("\nFifteenth exercise");
        IFilePath.methodRun(new Greeter(3,"Soup"),new Greeter(3,"Meow"),new Greeter(3,"Trylyalya"),new Greeter(3,"Daaaam")).run();



    }

}
