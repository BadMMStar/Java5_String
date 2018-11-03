package com.company;

import java.util.Scanner;

// Задание 5. Для заданного символа определить, сколько раз он встречается во
// введенном тексте (без учёта регистра). 2 варианта исполнения программы, используя класс String и StringBuffer
public class Main {

    public static void main(String[] args) {

        System.out.print("Enter string -> ");
        Scanner str = new Scanner(System.in);
        String sentence = new String(str.nextLine()); // Explicit construction via new

        System.out.print("Enter symbol and we calculate -> ");
        Scanner ch = new Scanner(System.in);
        String searchChar = new String(ch.next());

        boolean isFound = false;
        int count = 0;

        for (int i = 0; i < sentence.length(); ++i) {
            // Use method toLowerCase() to ignore case. And charAt(0) for conversion to char
            if (sentence.toLowerCase().charAt(i) == searchChar.toLowerCase().charAt(0)) {
                isFound = true;
                count++;
            }
        }

        System.out.print("The symbol is found " + count + " many times.");
    }

}