package ro.siitproject.homeworks.homework_4;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner tastatura = new Scanner(System.in);
        System.out.println("Introduceti n!");
        double n = tastatura.nextDouble();
        System.out.println("Rezultatul este: " + factorial(n));
        System.out.println("Rezultatul este: " + factorialRecursiv(n));
    }

    private static double factorial(double n) {
        double f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    private static double factorialRecursiv(double n) {
        if (n == 0) {
            return 1;
        }
        return n * factorialRecursiv(n - 1);
    }
}
