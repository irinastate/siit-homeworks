package ro.siitproject.homeworks.homework_11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyHashMap {

    public static void main(String[] args) {
        Adresa a1 = new Adresa("Romania", "Bucuresti", "Bd. Dacia");
        Adresa a2 = new Adresa("Spania", "Barcelona", "Bd. Rambla del Raval");
        Adresa a3 = new Adresa("Anglia", "London", "Str. Oxford");
        Adresa a4 = new Adresa("Austria", "Vienna", "Bd. Donnersbach");
        Adresa a5 = new Adresa("Japonia", "Tokyo", "Bd. Tohoku");
        Adresa a6 = new Adresa("Scotia", "Edinburgh", "Bd. Aviemore");

        ArrayList<Adresa> list1 = new ArrayList<>();
        list1.add(a1);
        list1.add(a2);
        ArrayList<Adresa> list2 = new ArrayList<>();
        list2.add(a1);
        list2.add(a4);
        list2.add(a6);
        ArrayList<Adresa> list3 = new ArrayList<>();
        list3.add(a5);
        list3.add(a3);

        ArrayList<Hobby> hobbylist1 = new ArrayList<>();
        hobbylist1.add(new Hobby("Football", 3, list1));

        ArrayList<Hobby> hobbylist2 = new ArrayList<>();
        hobbylist2.add(new Hobby("Football", 3, list1));
        hobbylist2.add(new Hobby("Baseball", 3, list2));
        hobbylist2.add(new Hobby("Tennis", 3, list3));

        ArrayList<Hobby> hobbylist3 = new ArrayList<>();
        hobbylist3.add(new Hobby("Basketball", 3, list3));
        hobbylist3.add(new Hobby("Dance", 3, list2));
        hobbylist3.add(new Hobby("Tennis", 3, list2));

        HashMap<Persoana, List<Hobby>> map = new HashMap<>();
        map.put(new Student("Georgescu Ionut", 23), hobbylist1);
        map.put(new Somer("Ionescu Silviu", 20), hobbylist2);
        map.put(new Angajat("Popescu Cristina", 32), hobbylist3);

        for (Map.Entry mapList : map.entrySet()) {
            System.out.println(mapList.getKey() + " " + mapList.getValue());
        }
    }
}
