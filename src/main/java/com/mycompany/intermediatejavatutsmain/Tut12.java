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
public class Tut12 {

    public static void main(String[] args) {

        // String array.
        String[] strArr = {"apple", "oranges", "corn", "ham"};

        // Convert to list.
        List<String> strList = Arrays.asList(strArr);

        // Create array list
        List<String> strList2 = new ArrayList<String>();

        strList2.add("youtube");
        strList2.add("google");
        strList2.add("netflix");
        strList2.add("amazon");

        strList2.addAll(strList);

        for (String str : strList2) {
            System.out.printf("%s ", str);
        }

    }

}
