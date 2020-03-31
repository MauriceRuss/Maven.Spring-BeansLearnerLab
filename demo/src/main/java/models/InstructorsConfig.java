package models;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Configuration
public class InstructorsConfig {
    public InstructorsConfig() {
    }

    @Bean(name = "tcUsaInstructors")
    public Instructors tcUsaInstructors(){
        List<Instructor> techConUSAInstr = new ArrayList<>();

        techConUSAInstr.add(new Instructor(1L, "Kris"));
        techConUSAInstr.add(new Instructor(2L, "Nobles"));
        techConUSAInstr.add(new Instructor(3L, "Dolio"));
        techConUSAInstr.add(new Instructor(4L, "Mo"));
            return new Instructors(techConUSAInstr);
    }

    @Bean(name = "tcUkInstructors")
    public Instructors tcUkInstructors(){
        List<Instructor> techConUkInstr = new ArrayList<>();

        techConUkInstr.add(new Instructor(5L, "Frolian"));
        techConUkInstr.add(new Instructor(6L, "Roberto"));
        techConUkInstr.add(new Instructor(7L, "Nancy"));
        techConUkInstr.add(new Instructor(8L, "Desa"));
            return new Instructors(techConUkInstr);
    }

    @Primary
    @Bean(name = "zcWilmInstr")
    public Instructors instructors(){
        List<Instructor> zcWilmInstr = Stream.concat(tcUsaInstructors().findAll().stream(),tcUkInstructors().findAll().stream())
                .collect(Collectors.toCollection(ArrayList::new));

            return new Instructors(zcWilmInstr);
    }
}
