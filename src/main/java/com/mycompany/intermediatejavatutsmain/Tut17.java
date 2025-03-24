/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.intermediatejavatutsmain;

/**
 *
 * @author gavan
 */
// https://www.youtube.com/watch?v=J6B_qauxfuc&list=PL27BCE863B6A864E3&index=17
public class Tut17 {

    private static void printMe(Integer[] i) {
        for (Integer item : i) {
            System.out.printf("%s ", item);
        }
    }

    private static void printMe(Character[] c) {
        for (Character item : c) {
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
