package ro.siitproject.homeworks.homework_7;

import java.util.Scanner;

public class MyProgram {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Introduce one of the following arithmetic operators: +,-,*,/ ");
        String operator = keyboard.nextLine();

        double value1, value2, result;

        switch (operator) {
            case "+":
                System.out.println("Introduce the first value:");
                value1 = keyboard.nextDouble();
                System.out.println("Introduce the second value:");
                value2 = keyboard.nextDouble();
                System.out.println(result = sum(value1, value2));
                break;
            case "-":
                System.out.println("Introduce the first value:");
                value1 = keyboard.nextDouble();
                System.out.println("Introduce the second value:");
                value2 = keyboard.nextDouble();
                System.out.println(result = subtract(value1, value2));
                break;
            case "*":
                System.out.println("Introduce the first value:");
                value1 = keyboard.nextDouble();
                System.out.println("Introduce the second value:");
                value2 = keyboard.nextDouble();
                System.out.println(result = multiply(value1, value2));
                break;
            case "/":
                System.out.println("Introduce the first value:");
                value1 = keyboard.nextDouble();
                System.out.println("Introduce the second value:");
                value2 = keyboard.nextDouble();
                if (value2 == 0) {
                    System.out.println("Error");
                } else {
                    System.out.println(result = divide(value1, value2));
                }
                break;
            default:
                System.out.println("Invalid operation");
        }
    }

    private static double sum(double value1, double value2) {
        return value1 + value2;
    }

    private static double subtract(double value1, double value2) {
        return value1 - value2;
    }

    private static double multiply(double value1, double value2) {
        return value1 * value2;
    }

    private static double divide(double value1, double value2) {
        return value1 / value2;
    }
}
