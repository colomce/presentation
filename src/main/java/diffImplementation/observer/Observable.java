package diffImplementation.observer;

public interface Observable {
    void registerObserver(Observer observer);
    void notifyObservers(Student student, KlassEvents klassEvent);
}
