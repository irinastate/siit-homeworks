package ro.siitproject.homework_6;

import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Introduce the producy base price: ");
        double basePrice = keyboard.nextDouble();
        System.out.println("Introduce VAT: ");
        double vat = keyboard.nextDouble();
        if (vat < 0) {
            System.out.println("Incorrect VAT, try again!");
        } else {
            System.out.println("The product price witth VAT is: " + calculatePrice(basePrice, vat));
        }
    }

    public static double calculatePrice(double basePrice, double vat) {
        return basePrice + (vat / 100 * basePrice);
    }
}
