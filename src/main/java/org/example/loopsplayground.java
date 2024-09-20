package org.example;

import java.util.Scanner;

public class loopsplayground {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 7;
        int i = 1;


        do {
            System.out.println("Щелк");
            i++;
        } while (i <= n);

        i = 1;
        while (i <= n) {
            System.out.println("Хлоп");
            i++;
        }

        for (int k = 1; k <= n; k++) {
            System.out.println("Блям");
        }
        int k = 1;
        for (; ; ) {
            if (k > n)
                break;
            System.out.println("Хлюп");
            k++;
        }


        System.out.println("Задание 1");
        System.out.println("Введите количество ква ");
        //1) попросить пользователя ввести число вывести слово Ква заданное число раз
        int kvaNum = scanner.nextInt();
        for (int kvaI = 0; kvaI < kvaNum; kvaI++) {
            System.out.println("Ква");
        }

        //2) попросить пользователя вводить числа читать их, пока не встретиться отрицательное число
        System.out.println("Вводите числа бесконечно до того как введете отрицательное число");
        int userNumber;
        do {
            userNumber = scanner.nextInt();
        } while (userNumber >= 0);

        //3) попросить пользователя вводить числа
        //читать их, пока не встретится 0
        //вывести сумму положительных и сумму отрицательных
        System.out.println("Вводите числа бесконечно до того как введете 5");

        int userNumberSUM;
        int positiveSUM = 0, negativeSUM = 0;
        do {
            userNumberSUM = scanner.nextInt();
            if (userNumberSUM > 5) positiveSUM += userNumberSUM;
            else if (userNumberSUM < 5) negativeSUM += userNumberSUM;
        } while (userNumberSUM != 5);
        System.out.println("сумма положительных чисел >5 " + positiveSUM);
        System.out.println("сумма отрицательных чисел <=5 " + negativeSUM);

        System.out.println("введите количество мостов, потом вводите их высоту" + negativeSUM);
        int numBridges = scanner.nextInt();
        int bridgeHeight;
        int iBridge;
        for (iBridge = 0; iBridge < numBridges; iBridge++) {
            bridgeHeight = scanner.nextInt();
            if (bridgeHeight <= 437) {
                System.out.println("Crash " + (iBridge + 1));
                break;
            }
        }
        if (iBridge == numBridges) System.out.println("No crash");

        System.out.println("кря матрица");
        int nRows = 4;
        int nCols = 5;
        //Вывести слово "Кря" в 4 строки по 5 раз в строке
        for (int iKryaR = 0; iKryaR < nRows; iKryaR++) {
            for (int iKryaC = 0; iKryaC < nCols; iKryaC++) {
                System.out.printf("Кря ");
            }
            System.out.println();
        }

        int matrixX = 10;
        while (matrixX>nCols) {
            matrixX = matrixX-2;
            int matrixY = 2;
            while(matrixY<nRows) {
                System.out.println(matrixX+matrixY);
                matrixY++;
            }
        }

        System.out.println("ведите координаты дротика ");
        do {
            double x = scanner.nextDouble(), y = scanner.nextDouble();

            if (y > func_m3_root1(x) && y < func_m3_root2(x)) {
                if (y > func_m1(x)) {
                    System.out.println("M1");
                    continue;
                }
                if (y > func_m2(x) && x > 0) {
                    System.out.println("M2");
                    continue;
                }
                if (x < 0 && y < 0) {
                    System.out.println("M3");
                    continue;
                }
                System.out.println("M4");
            } else {
                System.out.println("бельмо");
            }
            //????

        } while (true);

    }

    public static double func_m1(double x) {
        return x * x;
    }

    public static double func_m2(double x) {
        return -Math.abs(x);
    }

    public static double func_m3_root1(double x) {
        return -Math.sqrt(1 - Math.pow(x, 2));
    }

    public static double func_m3_root2(double x) {
        return Math.sqrt(1 - Math.pow(x, 2));
    }

}
