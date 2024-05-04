package observer._2pull.impl.followers;

import observer._2pull.interfaces.Observer;
import observer._2pull.interfaces.Subject;

import java.util.List;

public class Follower2 implements Observer {

    Subject subject;
    public Follower2(Subject subject){
        this.subject = subject;
        subject.addObserver(this);
    }
    @Override
    public void update(String storyTitle) {
        if(storyTitle != null && !storyTitle.isEmpty()){
            System.out.println("Follower2 get story as " + storyTitle);
        }
    }

    @Override
    public void update(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void getPosts(Subject subject) {
        System.out.println(subject.getPosts());
    }
}
