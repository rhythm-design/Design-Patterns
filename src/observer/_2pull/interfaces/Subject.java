package observer._2pull.interfaces;

import java.util.List;

public interface Subject {

    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();

    void notifyObservers(Subject subject);

    List<String> getPosts();
}
