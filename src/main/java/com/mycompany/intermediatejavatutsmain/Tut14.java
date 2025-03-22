/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.intermediatejavatutsmain;

// https://www.youtube.com/watch?v=8TMBjfS8wY0
import java.util.Stack;

/**
 *
 * @author gavan
 */
public class Tut14 {
// The stack - LIFO

    private static void printStack(Stack<String> stack) {
        for (String string : stack) {
            System.out.printf("%s ", string);
        }
        System.out.println("");
    }

    public static void main(String[] args) {

        Stack<String> strStack = new Stack();

        strStack.push(
                "first");
        printStack(strStack);
        strStack.push(
                "second");
        printStack(strStack);

        strStack.push(
                "third");
        printStack(strStack);

        strStack.pop(); // we pop "third"
        printStack(strStack);

        strStack.pop(); // we pop "second"
        printStack(strStack);

        strStack.pop(); // we pop "first"
        printStack(strStack); // stack is empty

//        strStack.pop(); // Will cause EmptyStackException, must check if empty.
    }

}
