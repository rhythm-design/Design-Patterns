package observer._1push.impl.followers;

import observer._1push.interfaces.Observer;
import observer._1push.interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

public class Follower1 implements Observer {
    List<Subject> following;

    public Follower1(){
        this.following = new ArrayList<>();
    }

    @Override
    public void update(String storyTitle) {
        if(storyTitle != null && !storyTitle.isEmpty()){
            System.out.println("Follower1 get story as " + storyTitle);
        }
    }

    public void follow(Subject subject){
        if(!following.contains(subject)){
            following.add(subject);
            subject.addObserver(this);
        }
    }

    public void unfollow(Subject subject){
        subject.removeObserver(this);
    }
}
