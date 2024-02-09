package com.pack.fiaraoccaz.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "message")
public class Message {
    @Id
    String id;
    int user1;
    int user2;
    String message;
    Date date_envoi;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public int getUser1() {
        return user1;
    }
    public void setUser1(int user1) {
        this.user1 = user1;
    }
    public int getUser2() {
        return user2;
    }
    public void setUser2(int user2) {
        this.user2 = user2;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public Date getDate_envoi() {
        return date_envoi;
    }
    public void setDate_envoi(Date date_envoi) {
        this.date_envoi = date_envoi;
    }
}
