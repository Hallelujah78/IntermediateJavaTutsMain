/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.intermediatejavatutsmain;

// Using generic return types.
// Can't use > or < for string data. We use compareTo
/**
 *
 * @author gavan
 */
public class Tut19 {

    /* <T extends Comparable<T>> T defines a generic type, T, that is a
    class that must implement Comparable<T>. T must be a type that knows how to
    compare itself to another object of the same class. Return type is type T.
     */
    public static <T extends Comparable<T>> T max(T a, T b, T c, T d) {
        // Assume a is greatest.
        T maximum = a;

        // What does compareTo return?
        System.out.println(a.compareTo(b)); // returns negative int, a<b
        System.out.println(a.compareTo(c)); // returns pos int, a>b
        System.out.println(a.compareTo(d)); // returns zero, a==d

        if (maximum.compareTo(b) < 0) {
            maximum = b;
        }
        if (maximum.compareTo(c) < 0) {
            maximum = c;
        }
        if (maximum.compareTo(d) < 0) {
            maximum = d;
        }

        return maximum;
    }

    public static void main(String[] args) {
        // Passing integers.
        var maxInt = max(5, 99, 4, 5);
        System.out.println("The max is: " + maxInt); // Expect 99

        // Passing characters - can't mix and match upper and lowercase!
        var maxChar = max('a', 'b', 'v', 'z');
        System.out.println("The max is: " + maxChar); // Expect 99

    }
}
