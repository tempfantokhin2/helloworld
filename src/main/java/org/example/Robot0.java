package org.example;

import java.util.Scanner;

class TaskRobot {
    int angle = 0;
    int stepCounter = 0;
    int[] x;
    int[] y;
    String proga;

    TaskRobot(String proga) {
        this.proga = proga;
        this.x = new int[proga.length() + 1];
        this.y = new int[proga.length() + 1];
    }

    public void calculateLoopStep() {
        for (int i = 0; i < this.proga.length(); i++) {
            int robotState = i + 1;
            char symbol = this.proga.charAt(i);
            this.y[robotState] = this.y[robotState - 1];
            this.x[robotState] = this.x[robotState - 1];
            switch (symbol) {
                case 'S':
                    this.stepCounter++;
                    stepForward(robotState);
                    if (testLoopBack(robotState)) {
                        System.out.println(stepCounter);
                        return;
                    }
                    break;
                case 'R':
                    turnRight();
                    break;
                case 'L':
                    turnLeft();
                    break;
                default:
                    System.out.println("сбой программы");
            }
        }
        System.out.println(-1);
    }

    private boolean testLoopBack(int robotState) {
        for (int i = 0; i < robotState; i++) {
            if (this.x[i] == this.x[robotState] && this.y[i] == this.y[robotState]) return true;
        }
        return false;
    }

    private void turnLeft() {
        this.angle -= 90;
        if (this.angle < -180) this.angle = 90;
    }

    private void turnRight() {
        this.angle += 90;
        if (this.angle > 180) this.angle = -90;
    }

    private void stepForward(int robotState) {
        switch (this.angle) {
            case 0:
                this.y[robotState] = this.y[robotState - 1] + 1;
                break;
            case 90:
                this.x[robotState] = this.x[robotState - 1] + 1;
                break;
            case 180:
            case -180:
                this.y[robotState] = this.y[robotState - 1] - 1;
                break;
            case -90:
                this.x[robotState] = this.x[robotState - 1] - 1;
                break;
        }
    }
}

public class Robot0 {
    public static void main(String[] args) {
        //прочитать "программу робота", то есть строку из консоли
        String proga = readProga();
        //интерпретировать "программу робота" в соответствии с условием, то есть пройти строку посимвольно
        TaskRobot robot = new TaskRobot(proga);
        robot.calculateLoopStep();
    }

    private static String readProga() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("введите програму робота, содержащую буквы S, L, R без пробелов ");
        String s = scanner.next();
        return s;
    }

    //пример - перебор символов без реального выполнения команд
    private static void interpretProga2(String proga) {
        char[] symbols = proga.toCharArray();
        for (int i = 0; i < symbols.length; i++) {
            switch (symbols[i]){
                case 'S':
                    System.out.println("шаг вперед"); break;
                case 'R':
                    System.out.println("поворот вправо"); break;
                case 'L':
                    System.out.println("поворот влево"); break;
                default:
                    System.out.println("сбой программы");
            }
        }
    }

    //пример - перебор символов без реального выполнения команд
    private static void interpretProga3(String proga) {
        for (char symbol: proga.toCharArray()) {
            switch (symbol){
                case 'S':
                    System.out.println("шаг вперед"); break;
                case 'R':
                    System.out.println("поворот вправо"); break;
                case 'L':
                    System.out.println("поворот влево"); break;
                default:
                    System.out.println("сбой программы");
            }
        }
    }
}