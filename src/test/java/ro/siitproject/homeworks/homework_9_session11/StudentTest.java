package ro.siitproject.homeworks.homework_9_session11;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {
    Student student = new Student("Maria", "Ionescu", 9, 8, 9);

    @Test
    public void testFinalExam() {
        Assert.assertEquals(8.25, student.finalExam(), 0);
    }

    @Test
    public void TestGetMoney() {
        Assert.assertEquals(750, student.getMoney(), 0);
    }
}
