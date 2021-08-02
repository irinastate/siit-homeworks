package ro.siitproject.homeworks.homework_9_session11;

import java.util.List;


public class Professor extends University {

    private String name;
    private String surname;
    private String courseName;
    private double hoursOfWorking;
    private double examMark;

    public Professor() {
    }

    public Professor(String name, String surname, String courseName, double hoursOfWorking, double examMark) {
        this.name = name;
        this.surname = surname;
        this.courseName = courseName;
        this.hoursOfWorking = hoursOfWorking;
        this.examMark = examMark;
    }

    public double calculateAverageOfStudentsGrades(List<Double> marks) {
        Double sum = 0.0;
        if (!marks.isEmpty()) {
            for (Double mark : marks) {
                sum += mark;
            }
            return sum / marks.size();
        }
        return sum;
    }

    @Override
    public void printDetails() {
        System.out.println("The professor's name is " + name);
        System.out.println("The professor's surname is " + surname);
        System.out.println("The course's name is " + courseName);
    }

    @Override
    public double finalExam() {
        if (examMark > 7 && examMark <= 10) {
            System.out.println("You can continue teaching.");
            return examMark;
        } else
            System.out.println("You can't teach anymore.");
        return examMark;
    }

    @Override
    public double getMoney() {
        double salaryPerHour;
        double hoursOfWorkingForFullTimeProfessor = 40;
        if (hoursOfWorking == hoursOfWorkingForFullTimeProfessor) {
            double salaryFullTimeProfessor;
            return salaryFullTimeProfessor = 100 * hoursOfWorkingForFullTimeProfessor;
        }
        return salaryPerHour = 100 * hoursOfWorking;
    }
}

