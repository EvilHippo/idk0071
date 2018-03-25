package com.spring.controller;

import com.google.gson.Gson;
import com.spring.player.Player;
import com.spring.repository.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.*;
import java.util.Arrays;
import java.util.List;

@RestController
public class PlayerController {
    @Autowired
    private PlayerService playerService;
    private   Gson gson = new Gson();
    @RequestMapping(value="user/create", method = RequestMethod.POST)
    public void addPlayerInDatabase(@RequestBody String playerInJson){
        playerService.addPlayer(gson.fromJson(playerInJson, Player.class));

    }
    @RequestMapping(value="user/update", method = RequestMethod.POST)
    public void updatePlayerInDatabase(@RequestBody String playerInJson){
        playerService.updatePlayer(gson.fromJson(playerInJson, Player.class));

    }
    @RequestMapping(value="user/delete", method = RequestMethod.POST)
    public void deletePlayerInDatabase(@RequestBody String playerInJson){
        playerService.deletePlayer(gson.fromJson(playerInJson, Player.class).getUID());

    }
    @RequestMapping(value="user/get", method = RequestMethod.POST)
    public Player getPlayerInDatabase(@RequestBody String playerInJson){
        return playerService.getPlayer(gson.fromJson(playerInJson, Player.class).getUID());

    }
    @RequestMapping(value="user/play", method = RequestMethod.POST)
    public List<Player> getPlayerToPlay(@RequestBody String playerInJson){
        if(playerService.getPlayersToPlay(gson.fromJson(playerInJson, Player.class).getUID()).isPresent()) {
            return playerService.getPlayersToPlay(gson.fromJson(playerInJson, Player.class).getUID()).get();
        }
        return Arrays.asList(new Player(), new Player());

    }
    @RequestMapping(value="user/getAllPlayers")
    public List<Player> getAllPlayers(){
        return playerService.getAllPlayers();

    }
    @RequestMapping(value="user/getAll")
    public String getAll(){
        return playerService.getAll();

    }

}
