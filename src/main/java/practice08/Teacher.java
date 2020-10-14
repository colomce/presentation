package practice08;

public class Teacher extends Person {
    private Klass klass;
    public Teacher(int id, String name, int age, Klass klass) {
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
        return this.klass == null ?
                "" :
                super.introduce() + " I am a Teacher. I teach " + this.klass.getDisplayName() + ".";
    }
}
