/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.intermediatejavatutsmain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author gavan
 */
public class Tut13 {

    public static void main(String[] args) {

        // Frequency checks list against element - outputs how many times element appears in list.
        // String array.
        String[] strArr = {"apple", "oranges", "corn", "ham"};

        // Convert to list.
        List<String> strList = Arrays.asList(strArr); // asList is fixed size!

        // Create array list
        List<String> strList2 = new ArrayList<String>();

        strList2.add("youtube");
        strList2.add("google");
        strList2.add("netflix");
        strList2.add("amazon");

        strList2.addAll(strList);

        // Frequency.
        String element = "youtube";
        int freq = Collections.frequency(strList2, element);
        System.out.println(element + " occurs " + freq + " times.");

        // Add element n times.
        for (int i = 0; i < 5; i++) {
            strList2.add(element);
        }

        /* Attempting to add to a List created with asList will result in an
        UnsupportedOperationException
         */
//        strList.add(element);
        freq = Collections.frequency(strList2, element);
        System.out.println(element + " occurs " + freq + " times.");

        /* DISJOINT
        Checks two lists, returns true if they have no common elements.
         */
        boolean isDisjoint = Collections.disjoint(strList, strList2);
        System.out.println("strList and strList2 are disjoint? " + isDisjoint);

        Integer[] intArr1 = {1, 2, 3};
        Integer[] intArr2 = {4, 5, 99};
        List<Integer> intList1 = Arrays.asList(intArr1);
        List<Integer> intList2 = Arrays.asList(intArr2);

        isDisjoint = Collections.disjoint(intList1, intList2);
        System.out.println("intList1 and intList2 are disjoint? " + isDisjoint);

    }

}
