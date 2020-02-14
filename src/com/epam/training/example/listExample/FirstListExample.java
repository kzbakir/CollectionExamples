package com.epam.training.example.listExample;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FirstListExample {

    public static void main(String[] args) {
        List<String> firstList  = Arrays.asList("yellow","red","green","blue");
        List<String> secondList = Arrays.asList("yellow","red","green","blue");
        Collections.reverse(firstList);
        System.out.println(firstList);
        Collections.shuffle(secondList);
        System.out.println(secondList);
    }
}
