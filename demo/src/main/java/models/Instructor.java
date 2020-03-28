package models;

import java.util.Iterator;

public class Instructor extends Person implements Teacher {
    public Instructor(Long id, String name) {
        super(id, name);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {
        Double numberOfHoursPerLearner;
        Iterator<? extends Learner> iterator = learners.iterator();
        int len = 0;
        while (iterator.hasNext()){
            len++;
            iterator.next();
        }
        numberOfHoursPerLearner = numberOfHours/len;
        for (Learner l : learners){
            l.learn((numberOfHoursPerLearner));
        }
    }
}
