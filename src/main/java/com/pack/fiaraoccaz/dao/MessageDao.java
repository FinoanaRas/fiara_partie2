package com.pack.fiaraoccaz.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pack.fiaraoccaz.model.Message;
import com.pack.fiaraoccaz.repository.MessageRepository;

@Service
public class MessageDao {
    private MessageRepository mr;

    public MessageDao(MessageRepository mr){
        this.mr = mr;
    }

    public Message saveMessage(Message message) {
        return mr.save(message);
    }

    public List<Message> findMessagesByUsers(int user1, int user2) {
        return mr.findMessagesByUsers(user1, user2);
    }
}
