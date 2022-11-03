package by.itstep.antonsvirid.model.entity;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {
    @Test
    public void testSetAgeWith10() {
        Student student = new Student();

        int expected = 10;

        try {
            student.setAge(10);
        } catch (Exception exception) {

        }

        int actual = student.getAge();

        Assert.assertEquals(expected, actual);
    }

    @Test (expected = Exception.class)
    public void testSetAgeWithNegativParams() throws Exception {
        Student student = new Student();

        student.setAge(-10);
    }


}
