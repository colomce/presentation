package practice11;

import java.util.ArrayList;
import java.util.List;

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
        if(this.number != student.getKlass().getNumber()) {
            System.out.print("It is not one of us.\n");
        } else {
            this.leader = student;
            notifyObservers(student, "leader");
        }
    }

    public void appendMember(Student student) {
        student.setKlass(this);
        notifyObservers(student, "append");
    }

    @Override
    public void registerObserver(Observer observer) {
        if(observer != null) {
            this.observerList.add(observer);
        }
    }

    @Override
    public void notifyObservers(Student student, String action) {
        this.observerList.stream().forEach(observer ->  {observer.update(student, this, action);});
    }

    @Override
    public void removeObserver(Observer observer) {
        if(observer != null ){
            this.observerList.remove(observer);
        }
    }
}
