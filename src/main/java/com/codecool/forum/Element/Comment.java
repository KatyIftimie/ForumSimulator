package com.codecool.forum.Element;

import java.util.Date;

public class Comment extends ForumElement {
    private Topic topic;
    private boolean isModerated;

    public Comment(String message, Topic topic, boolean isModerated) {
        super(message);
        this.topic = topic;
        this.isModerated = isModerated;
    }

    public Topic getTopic() {
        return topic;
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }

    public boolean isModerated() {
        return isModerated;
    }

    public void setModerated(boolean moderated) {
        isModerated = moderated;
    }

    @Override
    public String toString() {
        return "Comment{" + getMessage() +
                "topic=" + topic +
                ", isModerated=" + isModerated +
                '}';
    }
}
