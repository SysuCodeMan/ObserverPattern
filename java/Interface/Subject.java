package Interface;

/*
Created by ChrisChan on 2017/8/4.
*/
public interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
