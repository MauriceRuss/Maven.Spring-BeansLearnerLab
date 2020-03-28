package models;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean(name = "students")
    public Students currentStudents(){
        List<Student> cohort = new ArrayList<>();
        return new Students(cohort);
    }

    @Bean
    public Students previousStudents(){
        List<Student> cohort = new ArrayList<>();
        return new Students(cohort);
    }
}
