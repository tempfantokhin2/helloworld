package org.example;

import java.util.Scanner;

/*
сделать программу

 */
public class task3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Введите координаты первой точки: \n");
        int coordinate1x = input.nextInt();
        int coordinate1y = input.nextInt();
        System.out.print("Введите координаты второй точки: \n");
        int coordinate2x = input.nextInt();
        int coordinate2y = input.nextInt();
        double range = java.lang.Math.sqrt(java.lang.Math.pow(coordinate1x - coordinate2x, 2) +
                java.lang.Math.pow(coordinate1y - coordinate2y, 2));
        System.out.println("Расстояние = " + range);
        if (range < 10)
            System.out.println("близко");
        else
            System.out.println("далеко");

    }
}
