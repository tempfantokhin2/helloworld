package org.example;

import java.util.Scanner;

public class functions3 {
    int a,b;

    public static void main(String[] args) {
        String wordToPrint = inputOneWord();
        printNTimes(wordToPrint, 4);
    }

    public static void inputTwoNumbers(){
        System.out.println();
        System.out.println();
        //Scanner sc
    }

    public static String inputOneWord(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите одно слово");
        String userInput = scanner.next();
        return userInput;
    }

    public static void printNTimes(String wordArg, int multiplierArg) {
        for (int i = 0; i < multiplierArg; i++) {
            System.out.println(wordArg);
        }

    }
}
