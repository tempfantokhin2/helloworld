package org.example;

import java.util.Scanner;

public class acmp124 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите N перекрестков и M тоннелей");
        int crossroads = scanner.nextInt();
        int tunnels = scanner.nextInt();

        int[] trafficLightsCounters = new int[crossroads];

        System.out.println("Введите два перекрестка которые соеденены тоннелем (всего "+tunnels+" тоннелей)");
        for (int i = 0; i < tunnels*2; i++) {
            //int crossroad1, crossroad2;

            trafficLightsCounters[scanner.nextInt()-1]++;
        }

        for (int i = 0; i < crossroads; i++) {
//          System.out.println("Для перекрестка i-"+i+" требуется "+trafficLights[i]+" светофоров");
            System.out.print(trafficLightsCounters[i]+" ");
        }
    }
}
