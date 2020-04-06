package com.exercises.ex7;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class WarAndPeace {


    private List<String> text;
    private TreeMap<String,Integer> words= new TreeMap<>();

    public WarAndPeace(String path) {
        try {
            text = Files.readAllLines(Paths.get(path), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<String> getText() {
        return text;
    }
    public void algorithm(){
        for (String s : text) {
            String[] line = s.replaceAll("[^a-zA-Z0-9]", " ").split("\\s");
            for (String word : line) {
                if ( words.get(word)==null) {
                    words.put(word,1);
                }
                else{
                    int old =words.get(word);
                    words.put(word, old + 1);
                }
            }

        }
    }

    public TreeMap<String, Integer> getWords() {
        return words;
    }
    public void answer(){
        for(Map.Entry entry:words.entrySet()){
            Object key = entry.getKey();
            Object val= entry.getValue();
            System.out.println("Word - "+key+" quantity - "+ val);
        }
    }
}
