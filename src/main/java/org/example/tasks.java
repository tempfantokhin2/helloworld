package org.example;

public class tasks {
    public static void main (String[] args) {
        Dog testDog1 = new Dog("unknown", 6.5, "Ralf", "Red\\Grey");
        Cat testCat1 = new Cat( 4.4, "Meow--two", "Grey");
        testDog1.doBark();
        testCat1.doMeow();
    }
}
class Dog {
    String color;
    String name;
    double age;
    String breed;

    public Dog(String breed, double age, String name, String color) {
        this.breed = breed;
        this.age = age;
        this.name = name;
        this.color = color;
    }

    public void doBark() {
        System.out.println("BARK!");
    }
}

class Cat {
    String color;
    String name;
    double age;

    public Cat(double age, String name, String color) {
        this.age = age;
        this.name = name;
        this.color = color;
    }

    public void doMeow() {
        System.out.println("meow...");
    }
}
