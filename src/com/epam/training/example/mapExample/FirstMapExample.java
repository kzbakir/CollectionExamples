package com.epam.training.example.mapExample;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class FirstMapExample {

    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<String, Integer>();
        Map<String, Integer> treeMap = new TreeMap<String, Integer>(hashMap);
        Map<String, Integer> linkedHashMap = new LinkedHashMap<String,Integer>(16,0.75f,true);
        hashMap.put("Smith", 30);
        hashMap.put("Anderson", 31);
        hashMap.put("Lewis", 29);
        hashMap.put("Cook", 29);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap);
        System.out.println("\nDisplay entries in ascending order of key");
        System.out.println(treeMap);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);
        System.out.println("\nThe age for "+ "Lewis is "+ linkedHashMap.get("Lewis").intValue());
        System.out.println(linkedHashMap);
    }
}
