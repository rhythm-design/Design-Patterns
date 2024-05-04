package observer._1push.impl;

import observer._1push.interfaces.Observer;
import observer._1push.interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

public class Influencer implements Subject {

    List<Observer> followersList;
    String storyTitle;

    public Influencer() {
        this.followersList = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        if(!followersList.contains(observer)){
            followersList.add(observer);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        followersList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        followersList.forEach(observer -> observer.update(storyTitle));
    }

    public void postStory(String storyTitle){
        this.storyTitle = storyTitle;
        notifyObservers();
    }
}
