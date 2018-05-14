package com.spring.controller;

import com.google.gson.Gson;
import com.spring.map.CompleteMap;
import com.spring.player.Leaderboard;
import com.spring.player.Player;
import com.spring.player.RegisteredUser;
import com.spring.player.SimplifiedPlayerForLeaderboard;
import com.spring.repository.PlayerService;
import com.spring.repository.RegisteredUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.*;
import java.util.Arrays;
import java.util.List;

@RestController
public class PlayerController {
    @Autowired
    private PlayerService playerService;
    @Autowired
    private RegisteredUserService registeredUserService;
    private Gson gson = new Gson();

    @RequestMapping(value = "user/create", method = RequestMethod.POST)
    public void addPlayerInDatabase(@RequestBody String playerInJson) {
        Player player = gson.fromJson(playerInJson, Player.class);
        try {
            player.setRegisteredUser(registeredUserService.getRegisteredUser(player.getRegisteredUser().getUsername()));
        } catch (NullPointerException e) {

        }
        System.out.println(playerService);
        playerService.addPlayer(player);
    }

    @RequestMapping(value = "user/update", method = RequestMethod.POST)
    public void updatePlayerInDatabase(@RequestBody String playerInJson) {
        Player player = gson.fromJson(playerInJson, Player.class);
        player.setRegisteredUser(registeredUserService.getRegisteredUser(player.getRegisteredUser().getUsername()));
        playerService.addPlayer(player);

    }

    @RequestMapping(value = "user/delete", method = RequestMethod.POST)
    public void deletePlayerInDatabase(@RequestBody String playerInJson) {
        playerService.deletePlayer(gson.fromJson(playerInJson, Player.class).getUID());

    }

    @RequestMapping(value = "user/get", method = RequestMethod.POST)
    public Player getPlayerInDatabase(@RequestBody String playerInJson) {
        return playerService.getPlayer(gson.fromJson(playerInJson, Player.class).getUID());
    }

    @RequestMapping(value = "user/play", method = RequestMethod.POST)
    public List<Player> getPlayerToPlay(@RequestBody String playerInJson) {
        System.out.println("glory");
        System.out.println("cake:" + playerInJson);

        if (playerService.getPlayersToPlay(gson.fromJson(playerInJson, Player.class).getUID()).isPresent()) {
            Player player1 = playerService.getPlayersToPlay(gson.fromJson(playerInJson, Player.class).getUID()).get().get(0);
            Player player2 = playerService.getPlayersToPlay(gson.fromJson(playerInJson, Player.class).getUID()).get().get(1);
            //If getMap is null that means that players haven't been assigned a map yet so one will be created.
            //If it isn't null that means that both players have a map and it will not be modified
            if (player1.getMap() == null) {
                CompleteMap completeMap = new CompleteMap();
                String map = completeMap.getJsonInTiledFormatWithDataInserted();
                player1.setMap(map);
                player2.setMap(map);
                playerService.updatePlayer(player1);
                playerService.updatePlayer(player2);
            }
            System.out.println(player1);
            System.out.println(player2);
            return Arrays.asList(player1, player2);
        }
        return Arrays.asList(new Player(), new Player());


    }

    @RequestMapping(value = "user/getAllPlayers")
    public List<RegisteredUser> getAllPlayers() {
        return playerService.getAllPlayers();

    }

    @RequestMapping(value = "leaderboard")
    public List<SimplifiedPlayerForLeaderboard> getLeaderboard() {
        Leaderboard leaderboard = playerService.getLeaderboardOfBestPlayers();
        leaderboard.sort();
        return leaderboard.getTopNumberOfPlayers(10);

    }
    @RequestMapping(value = "personalHistory", method = RequestMethod.POST)
    public List<SimplifiedPlayerForLeaderboard> getRegisteredPlayerPersonalGameHistory(@RequestBody String RegisteredPlayerInJson) {
        return playerService.getPersonalGameHistoryOfPlayer(gson.fromJson(RegisteredPlayerInJson, RegisteredUser.class).getUsername()).getSimplePlayers();

    }

}
