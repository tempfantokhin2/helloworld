package org.example;

import java.util.Scanner;

/*
сделать программу в которой пользователь вводит 2 числа
если они равны, то вывести "равны!", иначе если первое больше второго, то вывести "первое!", а иначе "второе"
 */
public class task1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Введите 2 числа: \n");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        if (num1 == num2)
            System.out.println("равны!");
        else
            System.out.println("не равны");

    }
}