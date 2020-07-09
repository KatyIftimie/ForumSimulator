package com.codecool.forum.Element;

import java.util.Date;

import java.util.concurrent.atomic.AtomicInteger;

public abstract class ForumElement {
    private  int id;
    private Date date;
    private String message;
    private static final AtomicInteger count = new AtomicInteger(0);


    public ForumElement(String message) {
        this.id = count.incrementAndGet();
        this.date = new Date();
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return new Date(date.getTime());
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
