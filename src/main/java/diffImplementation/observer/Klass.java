package diffImplementation.observer;

import java.util.ArrayList;
import java.util.List;

import static diffImplementation.observer.KlassEvents.NEW_APPENDED_STUDENT;
import static diffImplementation.observer.KlassEvents.NEW_LEADER;

public class Klass implements Observable {
    private int number;
    private Student leader;
    private List<Observer> observerList;

    public Klass(int number) {
        this.number = number;
        observerList = new ArrayList<>();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDisplayName() {
        return "Class " + this.number;
    }

    public Student getLeader() {
        return leader;
    }

    public void setLeader(Student leader) {
        this.leader = leader;
    }

    public void assignLeader(Student student) {
        if (this.number != student.getKlass().getNumber()) {
            System.out.print("It is not one of us.\n");
        } else {
            this.leader = student;
            notifyObservers(student, NEW_LEADER);
        }
    }

    public void appendMember(Student student) {
        student.setKlass(this);
        notifyObservers(student, NEW_APPENDED_STUDENT);
    }

    public boolean isIn(Student student) {
        return student.getKlass().number == this.number;
    }

    @Override
    public void registerObserver(Observer observer) {
        if (observer != null) {
            this.observerList.add(observer);
        }
    }

    @Override
    public void notifyObservers(Student student, KlassEvents klassEvent) {
        this.observerList.forEach(observer -> observer.update(student, klassEvent));
    }

}
