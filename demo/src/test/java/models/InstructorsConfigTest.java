package models;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)
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
    }

    @Test
    void tcUkInstructors() {
    }

    @Test
    void instructors() {
    }
}