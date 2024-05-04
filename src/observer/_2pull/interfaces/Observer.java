package observer._2pull.interfaces;

import java.util.List;

public interface Observer {

    void update(String storyTitle);

    void update(Subject subject);

    void getPosts(Subject subject);
}
