package ro.siitproject.homeworks.homework_9_session11;


public class Course {

    private String courseName;
    private double courseTime;

    public Course(String courseName, double courseTime) {
        this.courseName = courseName;
        this.courseTime = courseTime;
    }

    public boolean startCourse(double courseTime) {
        System.out.println("The curse started: ");
        if (courseTime > 0) {
            return true;
        } else
            return false;
    }

    public void printCourseDetails() {
        System.out.println("The name of the course is: " + courseName);
        if (courseTime > 0) {
            System.out.println("The course took " + courseTime + " hours");
        } else
            System.out.println("The course didn't start");
    }

    public double getCourseTime() {
        return courseTime;
    }
}
