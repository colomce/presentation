package practice04;

public class Student extends Person {
    private int klass;
    public Student(String name, int age, int Klass) {
        super(name, age);
        this.klass = Klass;
    }

    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }

    public String introduce() {
        return super.introduce() + " I am a Student. I am at Class " + this.klass +".";
    }
}
