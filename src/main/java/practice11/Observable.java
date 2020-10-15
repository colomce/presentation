package practice11;

public interface Observable {
    public void registerObserver(Observer observer);
    public void notifyObservers(Student student, String action);
}
