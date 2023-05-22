package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> res = new ArrayDeque<>();

        res.add(firstQueue.peek());
        firstQueue.remove();
        res.add(firstQueue.peek());
        firstQueue.remove();

        res.add(secondQueue.peek());
        secondQueue.remove();
        res.add(secondQueue.peek());
        secondQueue.remove();
        while (!firstQueue.isEmpty() && !secondQueue.isEmpty()) {
            firstQueue.add(res.getLast());
            res.removeLast();

            res.add(firstQueue.peek());
            firstQueue.remove(firstQueue.peek());
            res.add(firstQueue.peek());
            firstQueue.remove(firstQueue.peek());

            secondQueue.add(res.getLast());
            res.removeLast();

            res.add(secondQueue.peek());
            secondQueue.remove(secondQueue.peek());
            res.add(secondQueue.peek());
            secondQueue.remove(secondQueue.peek());
        }
        return res;


    }
}
