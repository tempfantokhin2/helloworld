package org.example;

import java.util.Scanner;

public class arrayRoutines {
    public static void main(String[] args) {
        int[] array = inputArray(7);
        printArray(array);
        System.out.print("минимальный элемент: "+array[minElementIndex(array)]);
        System.out.print("максимальный элемент: "+array[maxElementIndex(array)]);
        System.out.println("среднее равно "+avg(array));
        swapTwoElements(array, 1, 2);
        printArray(array);
        System.out.println("элемент 5 на индексе "+findElement(array, 5));

        findElementExample(array);
    }

    public static void findElementExample(int[] array) {
        System.out.println("введите число для поиска");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int position = findElement(array, x);
        if (position < 0) System.out.println("элемент "+x+" не найден ");
        else System.out.println("индекс элемента "+x+" в массиве равен "+position);
    }

    public static int[] inputArray(int size) {
        int[] mas = new int[size];
        System.out.println("введите массив из " + size + " целых чисел");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < mas.length; i++) {
            mas[i] = scanner.nextInt();
        }
        return mas;
    }

    public static void printArray(int[] array) {
        System.out.print("массив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int minElementIndex(int[] array) {
        int minValue, minIndex;

        minValue = array[0];
        minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (minValue>array[i]) {
                minValue = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static int maxElementIndex(int[] array) {
        int maxValue, maxIndex;

        maxValue = array[0];
        maxValue = 0;
        for (int i = 1; i < array.length; i++) {
            if (maxValue<array[i]) {
                maxValue = array[i];
                maxValue = i;
            }
        }
        return maxValue;
    }

    public static double avg(int[] mas){
        double av = 0;
        int sum = 0;
        for (int i = 0; i < mas.length; i++) {
            av+=mas[i];
        }
        av = av/mas.length;
        return av;
    }

    public static void swapTwoElements(int[] mas, int i, int j) {
        int temp = mas[i];
        mas[i] = mas[j];
        mas[j] = temp;
    }

    public static int findElement(int[] mas, int val) {
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] == val) return i;
        }
        return -10;
    }
}
