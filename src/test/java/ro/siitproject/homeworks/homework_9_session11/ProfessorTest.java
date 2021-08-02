package ro.siitproject.homeworks.homework_9_session11;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ProfessorTest {

    @Test
    public void testCalculateAverageOfStudentsGrades() {
        Professor professor = new Professor();
        ArrayList<Double> marks = new ArrayList<>();
        marks.add(9.5);
        marks.add(7.0);
        marks.add(8.5);
        marks.add(9.0);
        Assert.assertEquals(8.5, professor.calculateAverageOfStudentsGrades(marks), 0);
    }

    @Test
    public void testFinalExam() {
        Professor professor2 = new Professor("Cristina", "Ionescu", "English", 20, 9);
        Assert.assertEquals(9, professor2.finalExam(), 0);
    }

    @Test
    public void testGetMoney() {
        Professor professor2 = new Professor("Ioan", "Georgescu", "Spanish", 34.5, 9);
        Assert.assertEquals(3450, professor2.getMoney(), 0);
    }
}
