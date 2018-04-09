package com.spring.controller;

import com.google.gson.Gson;
import com.spring.map.CompleteMap;
import com.spring.player.Player;
import com.spring.repository.PlayerService;
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
        System.out.println(playerJSON);
        return playerJSON;


    }

    @MessageMapping("/game/start")
    @SendTo("/game/start")
    public String startGame(String playerJSON) throws Exception {
        Player player = playerService.getPlayer(gson.fromJson(playerJSON, Player.class).getUID());
        player.setReady(true);
        playerService.updatePlayer(player);
        if(playerService.checkGameReadyState(player.getUID())) {
            CompleteMap completeMap = new CompleteMap();
            completeMap.getJsonInTiledFormatWithDataInserted();
            return completeMap.getJsonInTiledFormatWithDataInserted();

        } else {
            return "{ \"game started\": false }";
        }

    }
}
