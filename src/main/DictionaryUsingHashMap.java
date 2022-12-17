package main;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sonud
 */
import java.util.HashMap;

public class DictionaryUsingHashMap {
    private static HashMap<String, String> dictionary;
    public DictionaryUsingHashMap(){
        this.dictionary = new HashMap<>();
        addwordlist();
    }
    public boolean addword(String word, String Meaning){
        try{
            dictionary.put(word,Meaning);
        }
        catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
    public static String getMeaning(String word){
        if(dictionary.containsKey(word)){
            return dictionary.get(word);
        }
        return "Meaning not found!!!";
    }
    private void addwordlist(){
        addword("Phase","a stage in the development of something");
        addword("Minute","infinitely or immeasurably small");
        addword("Practice","a customary way of operation or behavior");
        addword("Intend","have in mind as a purpose");
        addword("Issue","some situation or event that is thought about");
        addword("Establish","set up or found");
    }
}
