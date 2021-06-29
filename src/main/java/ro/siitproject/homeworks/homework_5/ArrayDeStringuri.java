package ro.siitproject.homeworks.homework_5;

public class ArrayDeStringuri {
    public static void main(String[] args) {

        cars();
    }

    public static void cars() {
        System.out.println("String Array elements displayed using for loop:");
        String[] carsName = new String[]{"Mazda", "BMW", "Opel", "Ford"};
        for (String car : carsName) {
            System.out.print(car + "; ");
        }
    }
}
