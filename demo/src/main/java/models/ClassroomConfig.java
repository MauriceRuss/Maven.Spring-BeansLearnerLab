package models;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class ClassroomConfig {

    public ClassroomConfig() {
    }

    @Bean
    @DependsOn({"instructors", "students"})
    public Classroom currentCohort(Instructors instructors, Students students){
        return new Classroom(instructors, students);
    }

    @Bean
    @DependsOn({"instructors", "students"})
    public Classroom previousCohort(Instructors instructors, Students students){
        return new Classroom(instructors, students);
    }
}
