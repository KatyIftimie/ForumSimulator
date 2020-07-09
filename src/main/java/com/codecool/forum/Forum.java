package com.codecool.forum;

import com.codecool.forum.Element.Comment;
import com.codecool.forum.Element.Topic;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private String title;
    private List<Topic> topics = new ArrayList<>();
    private static Forum instance;

    private Forum(){}

    public static Forum getInstance() {
        if(instance== null){
            instance= new Forum();
        }
        return instance;
    }

    public void addTopic (Topic topic) {
        topics.add(topic);
    }

    public List<Comment> getAllModeratedComments () {
        List<Comment> moderatedComments = new ArrayList<Comment>();
        for(Topic topic: topics) {
            for (Comment comment: topic.getComments()) {
                if(comment.isModerated()) {
                    moderatedComments.add(comment);
                }
            }
        }
        return moderatedComments;
    }
}
