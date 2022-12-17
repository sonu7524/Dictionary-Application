package com.example.dictionary;

import java.util.HashMap;

public class DictionaryUsingHashMap {
    private static HashMap<String, String> dictionary;

    public DictionaryUsingHashMap() {
        this.dictionary = new HashMap<>();
        addwordlist();
    }

    public boolean addword(String word, String Meaning) {
        try {
            dictionary.put(word, Meaning);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public static String getMeaning(String word) {
        if (dictionary.containsKey(word)) {
            return dictionary.get(word);
        }
        return "Meaning not found!!!";
    }

    private void addwordlist() {
        addword("phase", "a stage in the development of something");
        addword("minute", "infinitely or immeasurably small");
        addword("practice", "a customary way of operation or behavior");
        addword("intend", "have in mind as a purpose");
        addword("issue", "some situation or event that is thought about");
        addword("establish", "set up or found");
    }
}
