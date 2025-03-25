/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.intermediatejavatutsmain;

/**
 *
 * @author gavan
 */
public class Tut18 {

    // Creating a generic method.
    public static <T> void printMe(T[] arr) {
        for (T item : arr) {
            System.out.printf("%s ", item);
        }

    }

    // Generic classes and methods - can eliminate overloaded methods with different types
    public static void main(String[] args) {
        Integer[] iArr = {1, 2, 3, 4};
        Character[] cArr = {'a', 'b', 'c', 'd'};

        printMe(iArr);
        printMe(cArr);

    }

}
