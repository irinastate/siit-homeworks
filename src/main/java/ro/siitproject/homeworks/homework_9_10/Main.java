package ro.siitproject.homeworks.homework_9_10;

public class Main {
    public static void main(String[] args) {
        Phone phone = new SamsungS20();
        phone.addContact("1", "0725678903", "Ioana", "Popescu");
        phone.addContact("2", "0726458903", "Maria", "Ionescu");
        phone.listContacts();
        System.out.println("");

        phone.sendMessage("0725678903", "I am coming home");
        phone.listMessages("0725678903");
        System.out.println("");

        phone.call("0726458903");
        phone.call("0735797788");
        phone.viewHistory();

        Iphone10 iphone10 = new Iphone10("grey","plastic","123478990678945");
        SamsungS20 samsungS20 = new SamsungS20("black", "aluminium", "7893567890002345");
        Iphone11 iphone11 = new Iphone11("white", "aluminium", "27947599034567");
        SamsungA12 samsungA12 = new SamsungA12("pink", "plastic", "097345789903456");
    }
}
