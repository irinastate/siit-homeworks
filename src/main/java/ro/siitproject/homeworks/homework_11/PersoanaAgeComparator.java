package ro.siitproject.homeworks.homework_11;

import java.util.Comparator;

public class PersoanaAgeComparator implements Comparator<Persoana> {

    @Override
    public int compare(Persoana o1, Persoana o2) {
        int c = o1.getAge() - o2.getAge();
        if (c == 0) {
            c = o1.getName().compareTo(o2.getName());
        }
        return c;
    }
}
