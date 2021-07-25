package ro.siitproject.homeworks.homework_9_10;

import java.util.ArrayList;
import java.util.List;

public abstract class Brands implements Phone {

    private int currentBattery = BATTERY_LIFE;
    private List<Contact> contactList = new ArrayList<>();
    private List<Message> messageList = new ArrayList<>();
    private List<String> callsList = new ArrayList<>();


    @Override
    public void addContact(String no, String phoneNumber, String firstName, String lastName) {
        contactList.add(new Contact(no, phoneNumber, firstName, lastName));
    }

    @Override
    public void listContacts() {
        for (Contact c : contactList) {
            c.printContacts();
        }

    }

    @Override
    public void sendMessage(String phoneNumber, String message) {
        int limit = 100;
        if (currentBattery != 0) {
            if (message.length() > limit) {
                System.out.println(message.substring(0, limit) + "\n You have exceeded 500 characters!");
            } else {
                messageList.add(new Message(phoneNumber, message));
                System.out.println(message);
                currentBattery -= 1;
            }
        } else {
            System.out.println("Charge your phone (zero battery)");
        }
    }

    @Override
    public void listMessages(String phoneNumber) {
        for (Message m : messageList) {
            if (m.getPhoneNumber().equals(phoneNumber)) {
                System.out.println(m.getMessageBody());
            }
        }
    }

    @Override
    public void call(String phoneNumber) {
        if (currentBattery != 0) {
            callsList.add(phoneNumber);
        }else{
            System.out.println("Charge your phone (zero battery)");
        }
    }

    @Override
    public void viewHistory() {
        System.out.println(callsList);

    }

    public void rechargeBattery(){
        currentBattery = BATTERY_LIFE;
    }
}
