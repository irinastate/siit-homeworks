package ro.siitproject.homeworks.homework_10_session12;


import java.time.LocalDate;

public class MyMain {
    public static void main(String[] args) {

        Repository repository = new Repository();
        Student student1 = new Student("Ion", "Popescu", LocalDate.of(1990, 2, 1), 'M', "12345566");
        Student student2 = new Student("Ioana", "Georgescu", LocalDate.of(1996, 2, 1), 'F', "12890566");
        Student student3 = new Student("Maria", "Ionescu", LocalDate.of(1978, 2, 1), 'z', "12345666");
        Student student4 = new Student("Cristian", "Marin", LocalDate.of(1890, 2, 1), 'M', "12347786");
        Student student5 = new Student("", "Georgescu", LocalDate.of(1993, 2, 1), 'M', "12341236");

        repository.addStudent(student1);
        repository.addStudent(student2);
        repository.addStudent(student3);
        repository.addStudent(student4);
        repository.addStudent(student5);
        repository.deleteStudent("12341236");
        System.out.println(repository.toString());
        repository.retriveStudentWithAge("25");
    }
}
