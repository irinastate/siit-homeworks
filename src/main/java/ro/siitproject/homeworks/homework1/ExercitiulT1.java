package ro.siitproject.homeworks.homework1;

import java.util.Scanner;

public class ExercitiulT1 {
    public static void main(String[] args) {
        Scanner tastatura = new Scanner(System.in);
        System.out.println("EXERCITIUL T1: Citirea a 2 numere si afisarea inmultirii lor");

        System.out.println("Introduceti primul numar:");
        int number1 = tastatura.nextInt();

        System.out.println("Introduceti al doilea numar:");
        int number2 = tastatura.nextInt();

        int result = number1 * number2;
        System.out.println("Rezultatul este: " + result);
    }
}
