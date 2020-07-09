package com.codecool.forum.Element;

import com.codecool.forum.Type;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Topic extends ForumElement{
    private List<Comment> comments = new ArrayList<>();

    private String title = "";
    private Type type;


    public Topic(String message,  String title, Type type) {
        super(message);
        this.title = title;
        this.type = type;
    }

    public void  addComment(Comment comment) {
        comments.add(comment);
    }

    public List<Comment> getComments() {
        return new ArrayList<Comment>(this.comments);
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

//    @Override
//    public String toString() {
//        return "Topic{" +
//                "comments=" + comments +
//                ", title='" + title + '\'' +
//                ", type=" + type +
//                '}';
//    }


    @Override
    public String toString() {
        return "Topic{" +
//                "comments=" + comments +
                ", title='" + title + '\'' +
                ", type=" + type +
                '}';
    }
}
