package com.spring.controller;

import com.google.gson.Gson;
import com.spring.player.Player;
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
    private Gson gson = new Gson();

    @MessageMapping("/game")
    @SendTo("/game/play")
    public String getGameCoordinates(String playerJSON) throws Exception {
    try {
        Player player = gson.fromJson(playerJSON, Player.class);


        player.setOpponentUID(playerService.getPlayer(player.getUID()).getOpponentUID());
        playerService.updatePlayer(player);
        return playerJSON;
    } catch (Exception e) {
        e.printStackTrace();
        return playerJSON;
    }

    }

    @MessageMapping("/game/start")
    @SendTo("/game/start")
    public String startGame(String playerJSON) throws Exception {

        Player player = gson.fromJson(playerJSON, Player.class);
        player.setOpponentUID(playerService.getPlayer(player.getUID()).getOpponentUID());
        playerService.updatePlayer(player);

        if(playerService.checkGameReadyState(player.getUID())) {
            return "{ \"game started\": true }";
        } else {
            return "{ \"game started\": false }";
        }

    }
}
