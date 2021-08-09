package ro.siitproject.homeworks.homework_10_session12;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

public class Repository {

    Logger LOGGER = Logger.getLogger(Repository.class.getName());

    List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        try {
            checkDate(student);
            checkFirstLastName(student);
            checkGender(student);
            students.add(student);
        } catch (Exception e) {
            if (e.getMessage().equals("Invalid date")) {
                LOGGER.warning("Invalid date");
            } else if (e.getMessage().equals("Empty name")) {
                LOGGER.warning("Invalid first name/ last name");
            } else if (e.getMessage().equals("Invalid gender")) {
                LOGGER.warning("Invalid gender input");
            }
        }

    }

    public void checkDate(Student student) throws Exception {
        LocalDate date = student.getDateOfBirth();
        LocalDate limitYear = LocalDate.of(1900, 1, 1);
        LocalDate today = LocalDate.now();

        if (date.isBefore(limitYear) || date.isAfter(today.minusYears(18))) {
            throw new Exception("Invalid date");
        }
    }

    public void checkFirstLastName(Student student) throws Exception {
        String firstName = student.getFirstName();
        String lastName = student.getLastName();
        if (firstName.isEmpty() || lastName.isEmpty()) {
            throw new Exception("Empty name");
        }
    }

    public void checkGender(Student student) throws Exception {
        char gender = student.getGender();
        if (Character.toLowerCase(gender) != 'f' && Character.toLowerCase(gender) != 'm') {
            throw new Exception("Invalid gender");
        }
    }

    public void deleteStudent(String CNP) {
        if (CNP.isEmpty()) {
            LOGGER.warning("Invalid CNP");
        } else {
            boolean found = false;
            Iterator<Student> iterate = students.iterator();
            while (iterate.hasNext()) {
                Student s = iterate.next();
                if (CNP.equals(s.getCNP())) {
                    iterate.remove();
                    found = true;
                }
            }
            if (!found) {
                LOGGER.warning("Student not found");
            }
        }
    }

    public ArrayList<Student> retriveStudentWithAge(String age) {
        ArrayList<Student> returnList = new ArrayList<>();
        try {
            int ageAsInt = Integer.parseInt(age);
            if (ageAsInt < 0) {
                LOGGER.warning("Negative number");
            }
            int studentAge;
            LocalDate today = LocalDate.now();
            Period period;
            for (Student s : students) {
                period = Period.between(today, s.getDateOfBirth());
                studentAge = period.getYears();
                if (studentAge == ageAsInt) {
                    returnList.add(s);
                }
            }

        } catch (Exception e) {
            LOGGER.warning("Age introduced is not a number");
        }
        return returnList;
    }

    public String toString() {
        String result = "";
        for (Student s : students) {
            result = result + s.getFirstName() + "," + s.getLastName() + "," + s.getCNP() + "," + s.getDateOfBirth() + "\n";
        }
        return result;
    }
}
