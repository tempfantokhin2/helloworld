package org.example;

import java.util.Scanner;

//Сделать программу, которая просит пользователя ввести 20 чисел
//Подсчитать, сколько было введено чисел в диапазоне от 0 до 9, сколько в диапазоне от 10 до 99 и сколько во всех остальных
//вывести количества
public class loopsplayground_day2 {
    public static void main(String[] args) {
        problem1();
    }

    public static void problem0() {
        System.out.println("Введите 20 чисел");
        Scanner scanner = new Scanner(System.in);
        int range1 = 0, range2 = 0, range3 = 0;
        for (int i = 0; i < 20; i++) {
//            System.out.println("Введите 20 чисел (введенно " + i + ")");
            int userInput = scanner.nextInt();
            if (userInput < 9 && userInput > 0) range1++;
            else {
                if (userInput < 100 && userInput > 9) range2++;
                else {
                    range3++;
                }
            }
        }
        System.out.println("Диапазон 0-9 " + range1);
        System.out.println("Диапазон 10-99 " + range2);
        System.out.println("Все остальные " + range3);
    }

    public static void problem1() {
//        создаем массив из 20 целых числе
        final int N = 20;   //целая константа
        final float M = 30; //вещественная константа
        int[] numbers = new int[N];
        //int[] arr2 = new int[M]; нельзя сделать массив из нецелого количества элементов
        float[] arr3 = new float[N]; //a это массив из N вещественных чисел

        Scanner scanner = new Scanner(System.in);

        //Прочитаем массив чисел из консоли
        System.out.println("введите " + N + " целых чисел");
        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextInt();
        }
        //Закрываем сканер
        scanner.close();

//        Выведем числа, которые лежат в массиве
        int counter_0_9 = 0;
        int counter_10_99 = 0;
        int counterAnother = 0;
        System.out.println("вывод" + N + " целых чисел из массива");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        //Подсчитать, сколько в массиве чисел от 0 до 9, сколько от 10 до 99 и сколько отсальных
    }
}
