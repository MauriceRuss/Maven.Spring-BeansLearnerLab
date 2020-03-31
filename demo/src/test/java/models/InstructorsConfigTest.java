package models;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)
@SpringBootTest(classes = InstructorsConfig.class)
class InstructorsConfigTest {

    @Autowired
    @Qualifier("tcUsaInstructors")
    Instructors tcUsaInstructors;

    @Autowired
    @Qualifier("tcUkInstructors")
    Instructors tcUkInstructors;

    @Autowired
    @Qualifier("zcWilmInstr")
    Instructors zcWilmInstr;

    @Test
    void tcUsaInstructors() {
        String expectedName = "Kris";
        String actualName = tcUsaInstructors.findById(1L).getName();
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    void tcUkInstructors() {
        String expectedName = "Frolian";
        String actualName = tcUkInstructors.findById(5L).getName();
        Assert.assertEquals(expectedName, actualName);

    }

    @Test
    void instructors() {
        String expectedName = "Frolian";
        String actualName = zcWilmInstr.findById(5L).getName();
        Assert.assertEquals(expectedName, actualName);
    }


}