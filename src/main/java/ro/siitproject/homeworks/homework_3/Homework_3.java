package ro.siitproject.homeworks.homework_3;

import java.util.Scanner;

public class Homework_3 {
    public static void main(String[] args) {
        Scanner tastatura = new Scanner(System.in);

        System.out.println("Introduce un nume:");
        String name = tastatura.nextLine();

        if (name.isEmpty()) {
            System.out.println("Hello, stranger.");
        } else {
            System.out.println("Hello, " + name + "!");
        }
    }
}
