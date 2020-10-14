package practice11;

public class Student extends Person{
    private Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public String introduce() {
        boolean klassHasLeader = this.klass.getLeader() != null;
        return  klassHasLeader && this.klass.getLeader().equals(this) ?
                super.introduce() + " I am a Student. I am Leader of " + klass.getDisplayName() + "." :
                super.introduce() + " I am a Student. I am at " + klass.getDisplayName() + ".";
    }
}
