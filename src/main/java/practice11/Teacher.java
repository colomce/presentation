package practice11;

import java.util.LinkedList;

public class Teacher extends Person{
    private LinkedList<Klass> klasses;
    public Teacher(int id, String name, int age, LinkedList<Klass> klasses) {
        super(id, name, age);
        this.klasses = klasses;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public LinkedList<Klass> getClasses() {
        return klasses;
    }

    public void setClasses(LinkedList<Klass> klasses) {
        this.klasses = klasses;
    }

}
