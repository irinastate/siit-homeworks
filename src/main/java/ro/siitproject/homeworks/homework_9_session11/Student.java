package ro.siitproject.homeworks.homework_9_session11;

public class Student extends University {

    private String name;
    private String surname;
    private double gpa;
    private double gradeAverage;
    private double midTermGrade;
    private double finalGrade;

    public Student(String name, String surname, double gpa, double gradeAverage, double midTermGrade) {
        this.name = name;
        this.surname = surname;
        this.gpa = gpa;
        this.gradeAverage = gradeAverage;
        this.midTermGrade = midTermGrade;
    }

    @Override
    public void printDetails() {
        System.out.println("The student's name is " + name);
        System.out.println("The student's surname is " + surname);
        System.out.println("The student's GPA is " + gpa);
    }

    @Override
    public double finalExam() {
        finalGrade = (gradeAverage * 3 + midTermGrade) / 4;
        if (finalGrade < 5) {
            System.out.println("You didn't pass the final exam. Your mark is: ");
            return finalGrade;
        } else if (finalGrade >= 5 && finalGrade <= 10) {
            System.out.println("You passed the final exam. Your mark is: ");
            return finalGrade;
        }
        return finalGrade;
    }

    @Override
    public double getMoney() {
        if (gpa >= 9.50 && gpa <= 10) {
            System.out.println("You received a scholarship of: ");
            return 1000;
        } else if (gpa == 9.00 && gpa < 9.50) {
            System.out.println("You received a scholarship of: ");
            return 750;
        } else {
            System.out.println("You didn't receive a scholarship. You have no money in your school account: ");
            return 0;
        }
    }
}