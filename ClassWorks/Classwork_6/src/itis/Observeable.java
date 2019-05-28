package itis;

public interface Observeable {
    void addObserver(Observer observer);
    void notifyObservers();
}
