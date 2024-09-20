package org.example;

import java.util.Scanner;

public class knightmoves {
    public static int notationToNum(String notation) {
        return switch (notation) {
            case "a" -> 1;
            case "b" -> 2;
            case "c" -> 3;
            case "d" -> 4;
            case "e" -> 5;
            case "f" -> 6;
            case "g" -> 7;
            case "h" -> 8;
            default -> -1;
        };

    }

    public static String numtonotation(int notation) {
        return switch (notation) {
            case 1 -> "a";
            case 2 -> "b";
            case 3 -> "c";
            case 4 -> "d";
            case 5 -> "e";
            case 6 -> "f";
            case 7 -> "g";
            case 8 -> "h";
            default -> "ERR";
        };

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Введите координаты фигуры: ");
        String xNotation = input.next();


        int x = notationToNum(xNotation);
        int y = input.nextInt();

        //ВПРАВО вверх
        if (x + 2 <= 8 && y + 1 <= 8)
            System.out.println(numtonotation(x + 2) + "" + (y + 1));
        //вправо ВВЕРХ
        if (x + 1 <= 8 && y + 2 <= 8)
            System.out.println(numtonotation(x + 1) + "" + (y + 2));
        //ВЛЕВО вниз
        if (x - 2 > 0 && y - 1 > 0)
            System.out.println(numtonotation(x - 2) + "" + (y - 1));
        //влево ВНИЗ
        if (x - 1 > 0 && y - 2 > 0)
            System.out.println(numtonotation(x - 1) + "" + (y - 2));
        //ВПРАВО вниз
        if (x + 2 <= 8 && y - 1 > 0)
            System.out.println(numtonotation(x + 2) + "" + (y - 1));
        //вправо ВНИЗ
        if (x + 1 <= 8 && y - 2 > 0)
            System.out.println(numtonotation(x + 1) + "" + (y - 2));
        //ВЛЕВО вверх
        if (x - 2 > 0 && y + 1 <= 8)
            System.out.println(numtonotation(x - 2) + "" + (y + 1));
        //ВЛЕВО вниз
        if (x - 1 > 0 && y + 2 <= 8)
            System.out.println(numtonotation(x - 1) + "" + (y + 2));
    }
}
