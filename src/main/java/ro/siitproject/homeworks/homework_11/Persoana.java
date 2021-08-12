package ro.siitproject.homeworks.homework_11;

import java.util.Objects;

public class Persoana {

    private String name;
    private int age;

    public Persoana(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Persoane{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persoana persoane = (Persoana) o;
        return age == persoane.age && name.equals(persoane.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
