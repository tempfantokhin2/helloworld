package org.example;

import java.util.Scanner;

/*
сделать программу

 */
public class task4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Введите координаты первой окружности: \n");
        int coordinate1x = input.nextInt();
        int coordinate1y = input.nextInt();
        System.out.print("Введите радиус первой окружности: \n");
        int radius1 = input.nextInt();
        System.out.print("Введите координаты второй окружности: \n");
        int coordinate2x = input.nextInt();
        int coordinate2y = input.nextInt();
        System.out.print("Введите радиус второй окружности: \n");
        int radius2 = input.nextInt();
        double range = java.lang.Math.sqrt(java.lang.Math.pow(coordinate1x - coordinate2x, 2) +
                java.lang.Math.pow(coordinate1y - coordinate2y, 2));
        System.out.println("Расстояние = " + range);
        if (range <= radius1+radius2 && !(range + radius1 < radius2 || range + radius2 < radius1))
            System.out.println("пересекаются");
        else
            System.out.println("не пересекаются");

    }
}
