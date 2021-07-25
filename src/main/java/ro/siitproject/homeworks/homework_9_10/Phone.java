package ro.siitproject.homeworks.homework_9_10;

public interface Phone {

    int BATTERY_LIFE = 12;

    void addContact(String no, String phoneNumber, String firstName, String lastName);

    void listContacts();

    void sendMessage(String phoneNumber, String message);

    void listMessages(String phoneNumber);

    void call(String phoneNumber);

    void viewHistory();
}
