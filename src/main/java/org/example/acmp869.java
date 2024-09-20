package org.example;

import java.util.Scanner;
class TouristData {
    int numPeople;
    int payload;
    int[] peoplesMass;
}

public class acmp869 {
    public static void main(String[] args) {
        TouristData data = readData();

        int boatCount = getResult(data.numPeople, data.payload, data.peoplesMass);

        printResult(boatCount);
    }

    private static void printResult(int boatCount) {
        System.out.println("Ответ. Потребуется " + boatCount + " байдарки");
    }

    public static int getResult(int numPeople, int payload, int[] peoplesMass) {
        sortRoutines.bubbleSort(peoplesMass);
        //System.out.println("Вес путников по возрастанию");
        //arrayRoutines.printArray(peoplesMass);
        int boatCount = 0;
        //int peopleLeft = 0;
        for (int i = numPeople-1; i >= 0; i--) {
            boolean boatCanTake2 = false;
            if (peoplesMass[i]==-1) continue;

            for (int j = numPeople-1; j >= 0; j--) {
                if (peoplesMass[j]==-1) continue;
                if (i==j) continue;

                if (peoplesMass[i] + peoplesMass[j] < payload) {
                    System.out.println("Лодка "+(boatCount+1)+" возьмет 2х людей с весом " + peoplesMass[i] + " и " + peoplesMass[j]);
                    peoplesMass[i] = -1;
                    peoplesMass[j] = -1;
                    boatCount++;
                    //peopleLeft += 2;
                    boatCanTake2 = true;
                    break;
                }
            }
            if (!boatCanTake2) {
                if (peoplesMass[i] < payload) {
                    System.out.println("Лодка "+(boatCount+1)+" возьмет 1го человека с весом " + peoplesMass[i]);
                    peoplesMass[i] = -1;
                    boatCount++;
                    //peopleLeft += 1;
                }
            }
        }

        return boatCount;
    }

    private static TouristData readData() {
        TouristData data = new TouristData();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество человек и грузоподьемность байдарки:");

        //читаем заданное количество человек и грузуподьемность одной байдарки
        data.numPeople = scanner.nextInt();
        data.payload = scanner.nextInt();
        //читаем входные данные
        data.peoplesMass = getPeoplesMass(data.numPeople, scanner);

        return data;
    }

    private static int[] getPeoplesMass(int numPeople, Scanner scanner) {
        int[] peoplesMass = new int[numPeople];
        if(scanner.hasNext()) {
            for (int i = 0; i < numPeople; i++) {
                peoplesMass[i] = scanner.nextInt();
            }
        } else {
            System.out.println("Невозможно считать данные peoplesMass. Ошибка сканера. ");
        }
            return peoplesMass;
    }
}
