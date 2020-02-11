package com.mcheung.rest.webservices.restfulwebservices.todo;

import java.util.Date;

public class Todo {
    private long id;
    private String username;
    private String description;
    private Date targetData;
    private boolean isDone;

    public Todo(long id, String username, String description, Date targetData, boolean isDone) {
        super();
        this.id = id;
        this.username = username;
        this.description = description;
        this.targetData = targetData;
        this.isDone = isDone;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getTargetData() {
        return targetData;
    }

    public void setTargetData(Date targetData) {
        this.targetData = targetData;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }
}