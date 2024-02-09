package com.pack.fiaraoccaz.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.pack.fiaraoccaz.dao.MessageDao;
import com.pack.fiaraoccaz.entity.Token;
import com.pack.fiaraoccaz.entity.User;
import com.pack.fiaraoccaz.model.Message;
import com.pack.fiaraoccaz.repository.TokenRepository;
import com.pack.fiaraoccaz.service.UserService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/messages")
public class MessageController {
    private MessageDao messageDao;
    @Autowired
    private TokenRepository tokenRe ; 
    @Autowired
    private UserService userService;

    @Autowired
    public MessageController(MessageDao messageDao) {
        this.messageDao = messageDao;
    }

    @PostMapping("/{token}/{idU}")
    public Message createMessage( @PathVariable("token") String token, @PathVariable("idU") int user1, @RequestBody Message message) {
        Token tok = tokenRe.findIdUtilsateurFromToken(token); 
        Long id =Long.valueOf(user1);

        User user = userService.findUser(id);
        if(tok!=null && tok.isValid(id) && user.getEtat()==10){
            return messageDao.saveMessage(message);
        }
        return new Message();
    }

    @GetMapping("/chat/{token}/{idU}/{user2}")
    public List<List<Message>> getMessagesByUsers(@PathVariable("idU") int user1, @PathVariable("user2") int user2, @PathVariable("token") String token) {
        Token tok = tokenRe.findIdUtilsateurFromToken(token); 
        Long id =Long.valueOf(user1);

        User user = userService.findUser(id);
        if(tok!=null && tok.isValid(id) && user.getEtat()==10){
            List<List<Message>> messlist = new ArrayList<>();
            List<Message> listuser1 = messageDao.findMessagesByUsers(user1, user2);
            List<Message> listuser2 = messageDao.findMessagesByUsers(user2, user1);
            messlist.add(listuser1);
            messlist.add(listuser2);
            return messlist;
        }
        return new ArrayList<>();
    }
}
