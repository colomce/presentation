package practice11;

public interface Observable {
    void registerObserver(Observer observer);
    void notifyObservers(Student student, String action);
}
