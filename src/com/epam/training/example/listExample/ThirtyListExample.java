package com.epam.training.example.listExample;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThirtyListExample {

    public static void main(String[] args) {
        List<Integer> firstList = Arrays.asList(2,4,7,10,11,45,50,59,60,66);
        List<String> secondList = Arrays.asList("blue","green","red");
        System.out.println("(1) Index: "+ Collections.binarySearch(firstList,7));
        System.out.println("(2) Index: "+Collections.binarySearch(firstList,9));
        System.out.println("(3) Index: "+Collections.binarySearch(secondList,"red"));
        System.out.println("(4) Index "+Collections.binarySearch(secondList,"cyan"));
    }
}
