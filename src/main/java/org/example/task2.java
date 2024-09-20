package org.example;

import java.util.Scanner;

/*
сделать программу в которой пользователь вводит 2 числа

 */
public class task2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Введите 2 числа: \n");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        if (num1 == num2)
            System.out.println("равны!");
        else
            if (num1 > num2)
                System.out.println("первое!");
            else
                System.out.println("второе");

    }
}
