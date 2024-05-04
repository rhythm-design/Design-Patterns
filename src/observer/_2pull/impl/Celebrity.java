package observer._2pull.impl;

import observer._2pull.interfaces.Observer;
import observer._2pull.interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

public class Celebrity implements Subject {

    List<String> posts;

    List<Observer> followersList;

    String storyTitle;

    public Celebrity(){
        this.posts = new ArrayList<>();
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
        followersList.forEach(observer -> observer.update(this.storyTitle));
    }

    @Override
    public void notifyObservers(Subject subject) {
        followersList.forEach(observer -> observer.update(subject));
    }

    @Override
    public List<String> getPosts() {
        return this.posts;
    }

    public void postStory(String storyTitle){
        this.storyTitle = storyTitle;
        notifyObservers();
    }

    public void createPost(String postTitle){
        // note that we are not notifying observers for post created
        // creating hypothetical situation when user stalks over
        // to the person he/ she is following;
        if(postTitle != null && !postTitle.isEmpty())
            posts.add(postTitle);
        notifyObservers(this);
    }
}
