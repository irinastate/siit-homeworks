package ro.siitproject.homeworks.homework_9_session11;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Course course = new Course("Math", 4);
        System.out.println(course.startCourse(course.getCourseTime()));
        course.printCourseDetails();

        System.out.println("=================================================================");
        Student student = new Student("Ioan", "Ionescu", 9, 7, 8);
        System.out.println(student.getMoney() + " RON");
        System.out.println(student.finalExam());
        student.printDetails();

        System.out.println("=================================================================");
        Professor professor = new Professor();
        ArrayList<Double> marks = new ArrayList<>();
        marks.add(6.5);
        marks.add(7.0);
        marks.add(8.5);
        marks.add(9.0);
        System.out.println("The average of the students grades is: " + professor.calculateAverageOfStudentsGrades(marks));

        System.out.println();
        Professor professor2 = new Professor("Maria", "Popescu", "English", 20, 7);
        System.out.println("The professor's salary: " + professor2.getMoney() + " RON");
        System.out.println("The professor's final exam grade is: " + professor2.finalExam());
        professor2.printDetails();
    }
}
