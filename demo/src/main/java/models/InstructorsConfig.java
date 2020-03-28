package models;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import java.util.ArrayList;
import java.util.List;

public class InstructorsConfig {
    @Bean
    public Instructors tcUsaInstructors(){
        List<Instructor> techConUSAInstr = new ArrayList<>();
            return new Instructors(techConUSAInstr);
    }

    @Bean
    public Instructors tcUkInstructors(){
        List<Instructor> techConUkInstr = new ArrayList<>();
            return new Instructors(techConUkInstr);
    }

    @Primary
    @Bean
    public Instructors instructors(){
        List<Instructor> zcWilmInstr = new ArrayList<>();
            return new Instructors(zcWilmInstr);
    }
}
