package com.epam.training.example.setExample;

import java.util.HashSet;
import java.util.Set;

public class FirstSetExample {

    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("San Francisco");
        set.add("Berling");
        set.add("New York");
        System.out.println(set);
        for (Object element : set) {
            System.out.println(element.toString());
        }
    }


}
