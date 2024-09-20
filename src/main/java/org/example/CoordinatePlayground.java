package org.example;

import java.util.Scanner;

public class CoordinatePlayground {
    public static void main(String[] args) {
        Coordinate[] coordinateArray = inputArray(5);
        printArray(coordinateArray);
        System.out.println(coordinateArray[0].formatAsString());
    }

    public static Coordinate[] inputArray(int size) {
        Coordinate[] coordinateArray = new Coordinate[size];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите " + size + " пар координат:");
        for (int i = 0; i < size; i++) {
            coordinateArray[i] = new Coordinate(scanner.nextDouble(), scanner.nextDouble());
        }
        return coordinateArray;
    }

    public static void printArray(Coordinate[] coordinateArray) {
        System.out.println("Вот массив из " + coordinateArray.length + " координат");
        for (int i = 0; i < coordinateArray.length; i++) {
            System.out.println("[x:" + coordinateArray[i].x+ ", y:" + coordinateArray[i].y + "]");
        }
    }
}
