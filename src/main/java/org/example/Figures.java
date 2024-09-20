package org.example;


import java.util.Scanner;



public class Figures {
    public static void main(String[] args) {

//        Tringle testTringle1 = new Tringle();
//        System.out.println(testTringle1.getArea());
//        System.out.println(testTringle1.getPerimeter());
//        Rectangle testRectangle1 = new Rectangle();
//        System.out.println(testRectangle1.getArea());
//        System.out.println(testRectangle1.getPerimeter());

        System.out.println("Создаем массив прямоугольников");
        Rectangle[] testRectangleArray = new Rectangle[6];
        testRectangleArray[0] = new Rectangle(5, 5);
        testRectangleArray[1] = new Rectangle(1, 1);
        testRectangleArray[2] = new Rectangle(3, 3);

        testRectangleArray[3] = new Rectangle(4, 4);
        testRectangleArray[4] = new Rectangle(1, 1);
        testRectangleArray[5] = new Rectangle(2, 2);

        degubRectangles(testRectangleArray);
        sortRectangles(testRectangleArray);
        degubRectangles(testRectangleArray);

    }

    public static void degubRectangles(Rectangle[] rectangleArray) {
        System.out.println("Rectangle. Выводим массив размером "+rectangleArray.length);
        for (int i = 0; i < rectangleArray.length; i++) {
            System.out.println("-------------------- ");
            System.out.println("Rectangle "+i);
            System.out.println("его площадь "+rectangleArray[i].getArea());
            System.out.println("его периметр "+rectangleArray[i].getPerimeter());
        }
        System.out.println("---------------------------------------------------- ");
    }

    public static void sortRectangles(Rectangle[] rectangleArray) {
        partition(rectangleArray, 0, rectangleArray.length-1);
        //bubbleSort(rectangleArray);
    }

    public static void bubbleSort(Rectangle[] rectangleArray) {
        for (int j = 0; j < rectangleArray.length - 1; j++) {
            for (int i = 0; i < rectangleArray.length - 1 - j; i++) {
                if (rectangleArray[i].getPerimeter() > rectangleArray[i + 1].getPerimeter()) {
                    Rectangle tmp = rectangleArray[i];
                    rectangleArray[i] = rectangleArray[i + 1];
                    rectangleArray[i + 1] = tmp;
                }
            }
        }
    }

    public static void partition(Rectangle[] rectangleArray, int begin, int end) {
        //если часть из 1 элемента выходим из функции
        if (end-begin < 1) return;

        //берем центральный элемент в качестве опорного
        int pivotIndex = begin + ((end - begin) / 2);
        int pivotValue = rectangleArray[pivotIndex].getPerimeter();

        //переносим его вначало
        Rectangle tmp;
        tmp = rectangleArray[begin];
        rectangleArray[begin] = rectangleArray[pivotIndex];
        rectangleArray[pivotIndex] = tmp;

        int divisionIndex = begin - 1;

        for (int i = begin; i <= end; i++) {
            if (pivotIndex == i) continue;
            if(rectangleArray[i].getPerimeter() <= pivotValue) {
                //переносим элемент меньше опорного в левую часть
                divisionIndex++;
                tmp = rectangleArray[divisionIndex];
                rectangleArray[divisionIndex] = rectangleArray[i];
                rectangleArray[i] = tmp;
            }
        }

        //переносим опорный элемент в конец левой части
        //divisionIndex++;
        tmp = rectangleArray[divisionIndex];
        rectangleArray[divisionIndex] = rectangleArray[begin];
        rectangleArray[begin] = tmp;

        //рекурсивно запускаем алгоритм на левую и правую части
        partition(rectangleArray, begin, divisionIndex-1);
        partition(rectangleArray, divisionIndex+1, end);
    }
}

class Tringle {
    int a;
    int b;
    int c;
    boolean isThisValidTringle;

    Tringle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите a, b, c");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        if (true) this.isThisValidTringle = true;
    }

    public Tringle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getArea(){
        double s = getPerimeter()/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    public double getPerimeter(){
        return a + b + c;
    }
}

class Rectangle {
    int a;
    int b;

    Rectangle() {
        System.out.println("Введите a, b");
        Scanner scanner = new Scanner(System.in);
        this.a = scanner.nextInt();
        this.b = scanner.nextInt();
    }

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public double getArea(){
        return (this.a * this.b);
    }
    public int getPerimeter(){
        return (this.a + this.b) * 2;
    }
}