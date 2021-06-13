package ro.siitproject.homeworks.homework1;

import java.util.Scanner;

public class ExercitiulT3 {
    public static void main(String[] args) {
        Scanner tastatura = new Scanner(System.in);

        System.out.println("EXERCITIUL T3: Citirea unui numar de la tastatura");

        System.out.println("Introduceti un numar:");
        int y = tastatura.nextInt();

        if (y > 0 && y < 10) {
            System.out.println("Numarul este mai mic decat 10");
        } else if (y >= 10 && y < 20) {
            System.out.println("Numarul este intre 10-20");
        } else if (y > 30) {
            System.out.println("Numarul este mai mare decat 30");
        } else {
            System.out.println("Eroare");
        }
    }
}
