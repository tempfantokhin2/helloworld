package org.example;

public class dictant2 {
    public static void main(String[] args) {
        final int N = 6;
        final String VASYA = "Вася";

        for (int i = 0; i < N; i++) {
            System.out.println(VASYA);
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(VASYA+" ");
            }
            System.out.println();
        }

        for (int i = 0; i < N; i++) {
            if(i%2==0) System.out.println("здесь был " + VASYA);
            else System.out.println("никого не было");
        }

    }
}
