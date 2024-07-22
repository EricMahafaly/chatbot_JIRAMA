package com.example.chatbot.controller;

import org.hibernate.annotations.Parameter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/chat")
public class ChatController {

    @GetMapping
    public String insertChat() {
        return "hello world !!";
    }
}
