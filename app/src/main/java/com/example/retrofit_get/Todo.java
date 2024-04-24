package com.example.retrofit_get;

import com.google.gson.annotations.SerializedName;

public class Todo {
    @SerializedName("userId")
    private int userId;
    private int id;
    @SerializedName("title")
    private String title;
    private boolean completed;


    public Todo(int userid, int id, String title, Boolean complete) {
    }

    public Todo(int id, String title, boolean completed, int userId) {
        this.id = id;
        this.title = title;
        this.completed = completed;
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
