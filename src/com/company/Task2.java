package com.company;

import java.util.Scanner;

// StringBuffer
// There are no changes in this program except use StringBuffer. And in the comparison operator if. We converted to String.
// We could also use the method  setCharAt(Character.toLowerCase())

public class Task2 {
    public static void main(String[] args) {

        System.out.print("Enter string -> ");
        Scanner str = new Scanner(System.in);
        StringBuffer sentence = new StringBuffer(str.nextLine()); // Explicit construction via new

        System.out.print("Enter symbol and we calculate -> ");
        Scanner ch = new Scanner(System.in);
        StringBuffer searchChar = new StringBuffer(ch.next());

        boolean isFound = false;
        int count = 0;

        for (int i = 0; i < sentence.length(); ++i) {
            if (sentence.toString().toLowerCase().charAt(i) == searchChar.toString().toLowerCase().charAt(0)) {
                isFound = true;
                count++;
            }
        }

        System.out.print("The symbol is found " + count + " many times.");
    }
}

