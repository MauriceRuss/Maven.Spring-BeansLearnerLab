package models;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)
@SpringBootTest(classes = StudentConfig.class)
class StudentConfigTest {

    @Autowired
    @Qualifier("students")
    Students students;

    @Autowired
    @Qualifier("previousStudents")
    Students previousStudents;

    @Test
    void currentStudentsTest() {
        String expectedName = "Chip";
        String actualName = students.findById(3L).getName();
        Assert.assertEquals(expectedName, actualName);

    }

    @Test
    void previousStudents() {
        String expectedName = "Maggie";
        String actualName = previousStudents.findById(5L).getName();
        Assert.assertEquals(expectedName,actualName);
    }
}