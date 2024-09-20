package org.example;

import java.util.Scanner;

public class functions4 {
    public static void main(String[] args) {
        int coordinate1x, coordinate1y, radius1, coordinate2x, coordinate2y, radius2;
        Scanner input = new Scanner(System.in);

        System.out.print("Введите координаты первой окружности: \n");
        coordinate1x = input.nextInt();
        coordinate1y = input.nextInt();
        System.out.print("Введите радиус первой окружности: \n");
        radius1 = input.nextInt();
        System.out.print("Введите координаты второй окружности: \n");
        coordinate2x = input.nextInt();
        coordinate2y = input.nextInt();
        System.out.print("Введите радиус второй окружности: \n");
        radius2 = input.nextInt();

        double range = ruler(coordinate1x, coordinate1y, coordinate2x, coordinate2y);
        intersectionCheck(range, radius1, radius2);
    }

    public static void intersectionCheck(double range, int radius1, int radius2) {

        System.out.println("Расстояние = " + range);
        if (range <= radius1+radius2 && !(range + radius1 < radius2 || (range + radius2) < radius1))
            System.out.println("пересекаются");
        else
            System.out.println("не пересекаются");
    }

    public static double ruler(int coordinate1x,int coordinate1y,int coordinate2x,int coordinate2y) {
        int dKvadrat = ((coordinate1x - coordinate2x)*(coordinate1x - coordinate2x)) +
                        ((coordinate1y - coordinate2y)*(coordinate1y - coordinate2y));
        double d = java.lang.Math.sqrt(dKvadrat);
        return(d);
    }
}
