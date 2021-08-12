package ro.siitproject.homeworks.homework_11;

import java.util.List;

public class Hobby {

    private String hobbyName;
    private int frequency;
    private List<Adresa> addressList;

    public Hobby(String hobby, int frequency, List<Adresa> address) {
        this.hobbyName = hobby;
        this.frequency = frequency;
        this.addressList = address;
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "hobby='" + hobbyName + '\'' +
                ", frequency=" + frequency +
                ", address=" + addressList +
                '}';
    }
}
