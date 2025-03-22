/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.intermediatejavatutsmain;

import java.util.PriorityQueue;

/**
 *
 * @author gavan
 */
public class Tut15 {

    private static void printQueue(PriorityQueue<String> pq) {
        for (String string : pq) {
            System.out.printf("%s ", string);

        }
        System.out.println("");
    }

    // Queue - priority queue - basically a queue at a grocery store.
    // The priority queue is sorted as items are added. Default sorting seems to be alphabetical
    // for strings.
    public static void main(String[] args) {

        PriorityQueue<String> pq = new PriorityQueue();
        printQueue(pq);
        pq.offer("first");
        printQueue(pq);

        pq.offer("second");
        printQueue(pq);

        pq.offer("third");
        printQueue(pq);

        pq.offer("fourth");
        printQueue(pq); // first fourth second third

        pq.remove(); // Removes "first"
        printQueue(pq);

        pq.remove(); // removes "fourth"
        printQueue(pq);

        // Print element with hightest priority
        System.out.println(pq.peek());

        // Using 'poll'
        String str = pq.poll(); // Removes highest priority element.
        System.out.println("str: " + str);
        printQueue(pq);

    }

}
