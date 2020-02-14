package com.epam.training.example.mapExample;

import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

public class SecondMapExample {

    public static void main(String[] args) {
        Properties properties = System.getProperties();
        Iterator iterator = properties.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println(entry.getKey() + "--" + entry.getValue());
        }
    }
}
