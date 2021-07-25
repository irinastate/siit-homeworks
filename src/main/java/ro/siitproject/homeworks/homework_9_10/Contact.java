package ro.siitproject.homeworks.homework_9_10;

public class Contact {
    private String no;
    private String phoneNumber;
    private String firstName;
    private String lastName;

    public Contact(String no, String phoneNumber, String firstName, String lastName) {
        this.no = no;
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getNo() {
        return no;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void printContacts(){
        System.out.println(no + " " + phoneNumber + " " + firstName + " " + lastName);
    }
}
