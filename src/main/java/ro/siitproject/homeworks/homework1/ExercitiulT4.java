package ro.siitproject.homeworks.homework1;

import java.util.Scanner;

public class ExercitiulT4 {
    public static void main(String[] args) {
        Scanner tastatura = new Scanner(System.in);

        System.out.println("EXERCITIUL T4: Realizati o aplicatie ce imita un calculator");

        System.out.println("Introduceti unul din semnele: -, +, /, *");

        String semn = tastatura.next();

        System.out.println("Introduceti valoarea lui a:");
        int a = tastatura.nextInt();

        System.out.println("Introduceti valoarea lui b:");
        int b = tastatura.nextInt();

        int subtraction = a - b;
        int sum = a + b;
        double division = a / b;
        int multiplication  = a * b;

        String sign = "";
        switch (semn) {
            case "-":
                System.out.println("Rezultatul este: " + subtraction);
                break;
            case "+":
                System.out.println("Rezultatul este: " + sum);
                break;
            case "/":
                System.out.println("Rezultatul este: " + division);
                break;
            case "*":
                System.out.println("Rezultatul este: " + multiplication);
                break;
            default:
                System.out.println("EROARE");
        }
    }
}
