package com.epam.training.example.listExample;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondListExample {

    public static void main(String[] args) {
        List<String> firstList = Arrays.asList("yellow","red","green","blue");
        List<String> secondList = Arrays.asList("white","black");
        Collections.copy(firstList,secondList);
        System.out.println(firstList);

    }
}
