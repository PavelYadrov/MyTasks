package com.exercises.ex7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Actually almost all of the solutions is here
public class Tokens {
     private Stream<String> stream;
     private static final String vowels = new String("97 111 101 117 105 121");

     public Tokens(String path){
         try{
             stream = Files.lines(Paths.get(path));
         }
         catch (IOException e){
             e.printStackTrace();
         }
     }

    public static String getVowels() {
        return vowels;
    }

    public String toString() {
        stream.forEach(System.out::println);
         return "";
    }

    public List<String> getHundred(){
         List<String> tokens = new ArrayList<String>();
         Object[] s =  stream.toArray();
             int k =0;
             for(Object ss:s){
                 if (k>=100) break;
                 String[] wds =((String) ss).split("\\s");
                 for(String word:wds){
                     int[] kd = word.codePoints().toArray();
                     int count = 0;
                     for(int i:kd) {
                         if (!Character.isAlphabetic(i)) break;
                         count++;
                     }
                     if(count==kd.length&&kd.length>1) {
                         tokens.add(word);
                         System.out.println(word);
                         k++;

                     }
                 }
         }
            return tokens;
    }
    //Ninth  exercise
    public List<String> getFive(){
         List<String[]> words = stream.map(s -> s.split("\\s")).filter(strings -> strings.length>1).collect(Collectors.toList());
         List<String> wds = new ArrayList<>();
        for(String[] line:words){

            for(String word:line){
                Set<Integer> count = new HashSet<>();
                for(int i:word.toLowerCase().codePoints().toArray()){
                    if(Character.isAlphabetic(i)&&vowels.contains(String.valueOf(i))) count.add(i);
                }
                if (count.size()==5) wds.add(word);
            }
        }
        return wds;
    }

    //Tenth exercise
    public int average(){
        List<String[]> words = stream.map(s -> s.split("\\s")).filter(strings -> strings.length>1).collect(Collectors.toList());
        double res=0;
        double count=0;
        for(String[] line:words){
            for(String word:line){
                res+=word.length();
                count++;
            }
        }
        return (int) Math.round(res/count);
    }
    //Eleventh exercise
    public List<String> maxLength(){
        List<String[]> words = stream.map(s -> s.split("\\s")).filter(strings -> strings.length>1).collect(Collectors.toList());
        Map<Integer,List<String>> maxLen = new HashMap<>();
        int max =0;
        for(String[] line:words){
            for(String word:line){
                if (maxLen.get(word.length())==null) {
                    maxLen.put(word.length(),new ArrayList<>());
                    maxLen.get(word.length()).add(word);
                    max = Math.max(word.length(), max);
                }
                else {
                    maxLen.get(word.length()).add(word);
                    max = Math.max(word.length(), max);
                }
            }
        }
        return maxLen.get(max);
    }

    //Seventeenth exercise
    public List<String> fiveHundredStrings() {
        List<String[]> words = stream.map(s -> s.split("[^a-zA-Z0-9]")).filter(strings -> strings.length > 1).collect(Collectors.toList());
        Set<String> ww = new HashSet<>();
        int max = 0;
        for (String[] line : words) {
            ww.addAll(Arrays.asList(line));
        }
        return ww.parallelStream().sorted((s1, s2) -> s2.length() - s1.length()).limit(500).collect(Collectors.toList());
    }


}
