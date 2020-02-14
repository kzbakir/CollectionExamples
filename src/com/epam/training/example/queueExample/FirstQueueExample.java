package com.epam.training.example.queueExample;

import java.util.Deque;
import java.util.LinkedList;

public class FirstQueueExample {

    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<String>();
        deque.offer("Okkahoma");
        deque.offer("Indiana");
        deque.addFirst("Texas");
        deque.addFirst("Georgia");
        while (deque.size() > 0) {
            System.out.println(deque.remove() + "");
        }
    }
}
