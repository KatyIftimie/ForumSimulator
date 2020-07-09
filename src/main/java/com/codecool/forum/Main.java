package com.codecool.forum;

import com.codecool.forum.Element.Comment;
import com.codecool.forum.Element.Topic;

public class Main {
    public static void main(String[] args) {
        Topic topic = new Topic("1st forum message", "1st title", Type.NEWS);
        Topic topic2 = new Topic("1st forum mdfsfsdfdessage", "2st title", Type.ANNOUNCEMENT);


        Comment comment = new Comment("1st com mess", topic, false);
        Comment comment2 = new Comment("2nd com mess", topic, true);
        Comment comment3 = new Comment("2nd com dfsdmess", topic, true);
        comment.setModerated(true);
        topic.addComment(comment);
        topic2.addComment(comment2);
        topic.addComment(comment3);

        Forum.getInstance().addTopic(topic);
        Forum.getInstance().addTopic(topic2);

        System.out.println(Forum.getInstance().getAllModeratedComments());

//        System.out.println(topic);
//        System.out.println(topic2);
//        System.out.println(comment);
//        System.out.println(comment2);


    }
}
