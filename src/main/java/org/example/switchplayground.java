package org.example;

import java.util.Scanner;

public class switchplayground {
    public static void main(String notation) {
    Scanner scanner = new Scanner(System.in);
    String direction = scanner.next();

        switch (direction) {
            case "north":
                System.out.println("мы пойдем на север"); break;
            case "west":
                System.out.println("дракон плывет на запад"); break;
            case "east":
                System.out.println("восток дело тонкое"); break;
            case "south":
                System.out.println("ура"); break;
        }
    }
}
