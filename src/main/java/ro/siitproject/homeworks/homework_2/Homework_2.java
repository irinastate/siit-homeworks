package ro.siitproject.homeworks.homework_2;


import java.util.Scanner;

public class Homework_2 {
    public static void main(String[] args) {

        Scanner tastatura = new Scanner(System.in);
        System.out.println("Calculeaza indicele de masa corporala");

        System.out.println("Introduceti greutatea:");
        double weight = tastatura.nextDouble();

        System.out.println("Introduceti inaltimea in metri (cu virgula):");
        double height = tastatura.nextDouble();

        double BMI = weight / Math.pow(height, 2);
        System.out.println("BMI is: " + String.format("%.2f", BMI));

        if (BMI <= 18.49) {
            System.out.println("Subponderal");
        } else if (BMI > 18.50 && BMI < 24.99) {
            System.out.println("Greutate normala");
        } else if (BMI > 25.00 && BMI < 29.99) {
            System.out.println("Supraponderal");
        } else if (BMI > 30.00 && BMI < 34.99) {
            System.out.println("Obezitate (gradul I)");
        } else if (BMI > 35.00 && BMI < 39.99) {
            System.out.println("Obezitate (gradul II)");
        } else if (BMI >= 40.00) {
            System.out.println("Obezitate morbida");
        } else {
            System.out.println("Eroare");
        }
    }
}
