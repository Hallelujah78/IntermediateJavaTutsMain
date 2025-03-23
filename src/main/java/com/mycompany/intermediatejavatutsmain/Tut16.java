/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.intermediatejavatutsmain;

import java.util.*;

/**
 *
 * @author gavan
 */
public class Tut16 {

    // Hashset.
    public static void main(String[] args) {

        // HashSet - only unique values
        String[] strArr = {"apple", "apple", "grapes", "banana", "orange"};

        List<String> listA = Arrays.asList(strArr);

        System.out.printf("%s ", listA);
        System.out.println("");

        // Create a HashSet from our list.
        Set<String> setA = new HashSet<String>(listA);

        System.out.printf("%s ", setA);
        System.out.println(""); // duplicate "apple" removed

    }

}
