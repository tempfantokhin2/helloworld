package org.example;

import java.util.Scanner;

public class weekend {
    public static void main(String[] args) {
        func1("func1", 2);
        func2("func2", 2);
        func3();
        func4();

    }

    public static void func1(String s, int x) {
        for (int i = 0; i < x; i++) {
            System.out.print(s);
        }
        System.out.println();
    }

    public static void func2(String s, int x) {
        int i = 0;
        while (i<x) {
            System.out.print(s);
            i++;
        }
        System.out.println();
    }

    public static void func3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int userNumber = scanner.nextInt();
        for (int i = 0; i <= userNumber; i++) {
            func1("Ой", i+1);
        }

    }

    public static void func4() {
        String[] managerNames = {"Мария", "Екатерина", "Александра", "Анна", "Иван", "Гарсиа", "Мария", "Наталья"};

        for (int iName = managerNames.length-1; iName > 0; iName--) {
            switch (managerNames[iName].charAt(managerNames[iName].length()-1)) {
                case 'а':
                    func1(managerNames[iName], 3);
                    break;
                case 'я':
                    func1(managerNames[iName],2);
                    break;
                default:
                    func1(managerNames[iName],1);
                    break;
            }
        }
    }
}
