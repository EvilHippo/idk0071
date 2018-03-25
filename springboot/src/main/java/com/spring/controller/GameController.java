package com.spring.controller;

import com.spring.repository.PlayerService;
import com.spring.test.Greeting;
import com.spring.test.HelloMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class GameController {

    @Autowired
    private PlayerService playerService;

    @MessageMapping("/game")
    @SendTo("/game/play")
    public Greeting greeting(String message) throws Exception {
        long start = System.currentTimeMillis();




        return new Greeting("Hello, " + message + "!" + " " + (System.currentTimeMillis() - start));
    }
}
