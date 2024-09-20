package org.example;

import com.sun.tools.javac.Main;

import java.util.Arrays;

public class functions2 {
    public static void main(String[] args) {
//        exampleWithCats();  //вызов статического метода ТЕКУЩЕГО класса (без указания имени класса)
//        exampleWithDogs();
        example6();
    }

    public static void example1() {
        System.out.println("я подготовил для вас вот такой пример:");
    }
    public static void example2() {
        System.out.println("теперь другой пример");
    }
    public static void exampleWithCats() {
        System.out.println("надо сделать класс Cat");
        Cat.meow(); //вызов статического метода класса Cat
    }
    public static void exampleWithDogs() {
        System.out.println("надо сделать класс Dog");
        Dog.bark(); //вызов статического метода класса Cat
    }
    public static void example4(){
        sayName("Михаил");
        sayName("Василий Иванович");
        String[] words = {"Анна", "Мария", "Светлана", "Марина"};
        for (int i = 0; i < words.length; i++) {
            sayName(words[i]);
        }

        //пример с фильтрацией строк по первой букве
//        for (int i = 0; i < words.length; i++) {
//            if(words[i].startsWith("М"))
//                sayName(words[i]);
//        }
    }
    public static void sayName(String name){
        System.out.println("меня попросили назвать имя "+name);
    }

    //создать функцию, которая принимает на вход целое число и выводит его в консоль внутри фигурных скобок
    public static void printNumber(int x){
        System.out.println("{"+x+"}");
//        создать массив из нескольких целых чисел, например 500, 700, -5, -67, 0, 14
//        вывести каждое число содержащиеся в массиве, при помощи функции printNumber
    }
    public static void example5() {
        printNumber(124);
    }
    public static void example6() {
        int[] numbersToPrint = {500, 700, -5, -67, 0, 14};
        for (int i = 0; i < numbersToPrint.length; i++) {
            printNumber(numbersToPrint[i]);
        }
        //то же самое при помощи конструкции for-each
        for (int iNumbersToPrint:numbersToPrint) {
            printNumber(iNumbersToPrint);
        }
        //стрим-API streamAPI - метод на будущее пока не используем
        Arrays.stream(numbersToPrint).forEach(functions2::printNumber);

    }

    class Cat { //объявление класса, который будет служить "сборником методов!
        public static void meow() { //объявление метода(функции) внутри класса
            System.out.println("мяу");
        }
    }
    class Dog { //объявление класса, который будет служить "сборником методов!
        public static void bark() { //объявление метода(функции) внутри класса
            System.out.println("гав");
        }
    }
}
