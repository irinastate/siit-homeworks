package ro.siitproject.homeworks.homework1;

import java.util.Scanner;

public class ExercitiulT5 {
    public static void main(String[] args) {
        Scanner tastatura = new Scanner(System.in);

        System.out.println("EXERCITIUL T5: Afisati toare numérele pare de a 0 la 100");

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
