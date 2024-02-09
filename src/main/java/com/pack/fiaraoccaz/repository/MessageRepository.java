package com.pack.fiaraoccaz.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.pack.fiaraoccaz.model.Message;

public interface MessageRepository extends MongoRepository<Message, String>{
    @Query("{'user1': ?0, 'user2': ?1}")
    List<Message> findMessagesByUsers(int user1, int user2);
}
