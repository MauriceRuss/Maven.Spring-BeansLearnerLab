package models;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.ArrayList;
import java.util.List;
@Configuration
public class InstructorsConfig {
    public InstructorsConfig() {
    }

    @Bean(name = "tcUsaInstructors")
    public Instructors tcUsaInstructors(){
        List<Instructor> techConUSAInstr = new ArrayList<>();
            return new Instructors(techConUSAInstr);
    }

    @Bean(name = "tcUkInstructors")
    public Instructors tcUkInstructors(){
        List<Instructor> techConUkInstr = new ArrayList<>();
            return new Instructors(techConUkInstr);
    }

    @Primary
    @Bean(name = "zcWilmInstr")
    public Instructors instructors(){
        List<Instructor> zcWilmInstr = new ArrayList<>();
            return new Instructors(zcWilmInstr);
    }
}
