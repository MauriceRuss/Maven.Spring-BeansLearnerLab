package models;

public class Student extends Person implements Learner {
    private Double totalStudyTime;

    public Student(Long id, String name) {
        super(id, name);
    }

    public double getTotalStudyTime(){
        return totalStudyTime;
    }

    @Override
    public void learn(Double numberOfHours) {
        this.totalStudyTime += numberOfHours;
    }
}
