package observer._2pull;

import observer._2pull.impl.Celebrity;
import observer._2pull.impl.followers.Follower1;
import observer._2pull.impl.followers.Follower2;

import java.util.List;
import java.util.UUID;
import java.util.stream.IntStream;

public class ObserverPullRunner {

    public static void main(String[] args) {
        Celebrity celebrity = new Celebrity();
        Follower1 follower1 = new Follower1(celebrity);
        Follower2 follower2 = new Follower2(celebrity);
        // both followers would get the story update
        celebrity.postStory("New Update");
        // celebrity have added some posts in past
        addPosts(celebrity);
        // follower1 is now trying to stalk celebrity from it's following list
        follower1.getPosts(celebrity);
        addPosts(celebrity);
        // follower2 is now trying to stalk celebrity from it's following list
        follower2.getPosts(celebrity);
    }

    public static void addPosts(Celebrity celebrity){
        for(int i = 0; i < 5; i++){
            celebrity.createPost(String.valueOf(UUID.randomUUID()));
        }
    }
}
