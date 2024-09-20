package org.example;

import java.util.Scanner;

public class CardArrays {
    public static void main(String[] args) {
//        PlayingCard card1 = new PlayingCard();
//        card1.suit = "пики";
//        card1.rank = "валет";
        PlayingCard card2 = new PlayingCard("бубны", "валет");
        PlayingCard card3 = new PlayingCard("трефы", "дама");
        System.out.println(card2.suit + " " + card2.rank);
        /*
пики 10
трефы 6
черви король
бубны туз
бубны 8

         */
        PlayingCard[] cards = inputArray(5);
        printArray(cards);
        bubbleSort(cards);
        printArray(cards);
    }

    public static PlayingCard[] inputArray(int size) {
        PlayingCard[] mas = new PlayingCard[size];
        System.out.println("Введите массив из " + size + " игральных карт");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            System.out.println("Вот масть и карту:");
            mas[i] = new PlayingCard(scanner.next(), scanner.next());
        }
        return mas;
    }

    public static void printArray(PlayingCard[] array) {
        System.out.println("Вот массив из " + array.length + " игральных карт");
        for (int i = 0; i < array.length; i++) {
            System.out.println("|" + array[i].suit + " | " + array[i].rank + "|");
        }
    }

    public static int calcPower(PlayingCard card) {
        return switch (card.rank) {
            case "2", "двойка" -> 2;
            case "3", "тройка" -> 3;
            case "4", "четверка" -> 4;
            case "5", "пятерка" -> 5;
            case "6", "шестерка" -> 6;
            case "7", "семерка" -> 7;
            case "8", "восьмерка" -> 8;
            case "9", "девятка" -> 9;
            case "10", "десятка" -> 10;
            case "валет" -> 11;
            case "дама" -> 12;
            case "король" -> 13;
            case "туз" -> 14;
            case "джокер" -> 15;
            default -> -1;
        };
    }

    public static void bubbleSort(PlayingCard[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            boolean arrayChanged = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (calcPower(array[j]) > calcPower(array[j + 1])) {
                    PlayingCard tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    arrayChanged = true;
                }
            }
            if (!arrayChanged) break;
        }
    }

}
