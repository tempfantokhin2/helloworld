package org.example;

import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        problem1();
    }

    public static void problem1() {
        String[] words = new String[8];

        Scanner scanner = new Scanner(System.in);
        String s = "Пожалуйста, введите " + words.length + " слов";
        System.out.println(s);
        for (int i = 0; i < words.length; i++) {
            words[i] = scanner.next();
        }
        //вывести слова в обратном порядке
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.println(words[i]);
        }
        //
        //опаздал 13.09. не успел
    }
}
