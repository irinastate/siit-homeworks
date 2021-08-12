package ro.siitproject.homeworks.homework_11;

import java.util.Set;
import java.util.TreeSet;

public class MyTreeSet {
    public static void main(String[] args) {

        Set<Persoana> persByName = new TreeSet<>(new PersoanaNameComparator());
        persByName.add(new Student("Maria", 25));
        persByName.add(new Student("Ana", 26));
        persByName.add(new Somer("Ionut", 33));
        persByName.add(new Angajat("Larisa", 42));

        for (Persoana pers : persByName) {
            System.out.println(pers);
        }

        System.out.println("======================================================");

        Set<Persoana> persByAge = new TreeSet<>(new PersoanaAgeComparator());
        persByAge.add(new Student("Maria", 25));
        persByAge.add(new Student("Ana", 26));
        persByAge.add(new Student("Maria", 40));
        persByAge.add(new Somer("Ionut", 33));
        persByAge.add(new Angajat("Larisa", 42));

        for (Persoana p : persByAge) {
            System.out.println(p);
        }
    }
}
