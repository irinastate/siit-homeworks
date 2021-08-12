package ro.siitproject.homeworks.homework_11;

public class Adresa {

    private String country;
    private String city;
    private String street;

    public Adresa(String country, String city, String street) {
        this.country = country;
        this.city = city;
        this.street = street;
    }

    @Override
    public String toString() {
        return "Adresa{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
