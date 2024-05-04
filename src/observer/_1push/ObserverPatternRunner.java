package observer._1push;

import observer._1push.impl.Celebrity;
import observer._1push.impl.Influencer;
import observer._1push.impl.followers.Follower1;
import observer._1push.impl.followers.Follower2;

public class ObserverPatternRunner {

    public static void main(String[] args) {
        // 2 Subject whose story posted would be shown to observers
        Celebrity celebrity = new Celebrity();
        Influencer influencer = new Influencer();
        // 2 follows to observe the Subject classes
        Follower1 follower1 = new Follower1();
        Follower2 follower2 = new Follower2();

        follower1.follow(celebrity);
        // only follower1 would get the story as it is the only follower
        celebrity.postStory("India is super good");
        follower2.follow(celebrity);
        // both follower1 and follower2 would get the story
        celebrity.postStory("My followers is increasing, yayyy");
        follower2.follow(influencer);
        // only follower 2 would get the influencer story
        influencer.postStory("Want to make 11x? :)");
        // both will get story of celebrity
        celebrity.postStory("Spending time in Bengaluru");
        follower1.unfollow(celebrity);
        // only follower2 would get the story
        celebrity.postStory("My followers decreased :(");
    }
}
