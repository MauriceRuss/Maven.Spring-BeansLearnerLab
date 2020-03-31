package models;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;


@Configuration
public class StudentConfig {
    public StudentConfig() {
    }

    @Bean(name = "students")
    public Students currentStudents(){
        List<Student> cohort = new ArrayList<>();

        cohort.add(new Student(1L, "Giles"));
        cohort.add(new Student(2L, "Han"));
        cohort.add(new Student(3L, "Chip"));
        cohort.add(new Student(4L, "Mo"));
        return new Students(cohort);
    }

    @Bean(name = "previousStudents")
    public Students previousStudents(){
        List<Student> cohort = new ArrayList<>();

        cohort.add(new Student(5L, "Maggie"));
        cohort.add(new Student(6L, "Ron"));
        cohort.add(new Student(7L, "Josh"));
        cohort.add(new Student(8L, "Anish"));
        return new Students(cohort);
    }
}
