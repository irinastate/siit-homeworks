package ro.siitproject.homeworks.homework1;

import java.util.Scanner;

public class ExercitiulT2 {
    public static void main(String[] args) {
        Scanner tastatura = new Scanner(System.in);

        System.out.println("EXERCITIUL T2: Citirea unui numar de la tastatura");

        System.out.println("Introduceti un numar:");
        int x = tastatura.nextInt();
        if (x == 5) {
            System.out.println("Numarul este 5");
        } else {
            System.out.println("Numarul nu este 5");
        }
    }
}
