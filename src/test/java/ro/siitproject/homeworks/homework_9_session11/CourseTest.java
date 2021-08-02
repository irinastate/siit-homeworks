package ro.siitproject.homeworks.homework_9_session11;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class CourseTest {
    Course course = new Course("Math", 2);

    @Test
    public void testStartCourse() {
        Assert.assertTrue(course.startCourse(3));
        Assert.assertFalse(course.startCourse(0));
    }

    @Test
    public void testGetCourseTime() {
        Assert.assertEquals(2, course.getCourseTime(), 0.001);
    }
}