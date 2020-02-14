package com.epam.training.example.queueExample;

import java.util.ArrayDeque;
import java.util.Deque;

public class SecondQueueExample {

    public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<String>();
        Deque<String> queue = new ArrayDeque<String>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop() + " ");
        }
        queue.add("A");
        queue.add("B");
        queue.add("C");
        queue.add("D");
        while (!queue.isEmpty()) {
            System.out.println(queue.remove() + " ");
        }
    }


}
