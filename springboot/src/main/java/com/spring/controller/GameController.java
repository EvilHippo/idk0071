package com.spring.controller;

import com.google.gson.Gson;
import com.spring.map.CompleteMap;
import com.spring.player.Player;
import com.spring.repository.PlayerService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import java.util.Iterator;

@Controller
public class GameController {

    @Autowired
    private PlayerService playerService;
    private Gson gson = new Gson();

    /**
     * Bounces all sent info to all websocket subscribers.
     */
    @MessageMapping("/game")
    @SendTo("/game/play")
    public String getGameCoordinates(String playerJSON) throws Exception {
        return playerJSON;
    }

    /**
     * Confirms game request request.
     */
    @MessageMapping("/requestGame")
    @SendTo("/game/play")
    public String playerRequestGame(String playerJSON) throws Exception {
        JSONObject incomingJson = new JSONObject(playerJSON);

        String answer = "{\n" +
                "  \"option\": \"" + "gameRequest" + "\",\n" +
                "  \"id\" : \"" + incomingJson.get("id") + "\",\n" +
                "  \"name\" : \"" + incomingJson.get("name") + "\"\n" +
                "}";
        return answer;
    }

    /**
     * A timer has reached 0, game ends.
     */
    @MessageMapping("/notifyEnd")
    @SendTo("/game/play")
    public String gameEndNotification(String playerJSON) throws Exception {
        JSONObject incomingJson = new JSONObject(playerJSON);
        playerService.finishGame(Long.valueOf(String.valueOf(incomingJson.get("player1"))), Long.valueOf(String.valueOf(incomingJson.get("player2"))), Double.valueOf(String.valueOf(incomingJson.get("p1score"))), Double.valueOf(String.valueOf(incomingJson.get("p2score"))));
        System.out.println("notifyEnd" + incomingJson);
        String answer = "{\n" +
                "  \"option\": \"" + "notifyEnd" + "\",\n" +
                "  \"id\" : \"" + incomingJson.get("player1") + "\",\n" +
                "  \"player1Score\" : \"" + incomingJson.get("p1score") + "\",\n" +
                "  \"player2Score\" : \"" + incomingJson.get("p2score") + "\"\n" +
                "}";
        return answer;
    }

    /**
     * Request game start, once answer is not own ID, start game with requester(s)
     */
    @MessageMapping("/requestStartGame")
    @SendTo("/game/play")
    public String playerRequestStartGame(String playerJSON) throws Exception {
        JSONObject incomingJson = new JSONObject(playerJSON);

        String answer = "{\n" +
                "  \"option\": \"" + "gameStartByRequest" + "\",\n" +
                "  \"id\" : \"" + incomingJson.get("id") + "\",\n" +
                "  \"name\" : \"" + incomingJson.get("name") + "\"\n" +
                "}";
        return answer;
    }

    /**
     * Updates movement for all clients when socket gets new message.
     */
    @MessageMapping("/movementUpdate")
    @SendTo("/game/play")
    public String movementUpdate(String playerJSON) throws Exception {
        JSONObject incomingJson = new JSONObject(playerJSON);
        if(incomingJson.get("move").equals("left") || incomingJson.get("move").equals("right")) {
            System.out.println("movement update json: " + incomingJson);
        }
        // note that here the incoming player cords is idCords, while otherCords are the coordinates of the sender's enemy

        String answer = "{\n" +
                "  \"option\": \"" + "movementUpdate" + "\",\n" +
                "  \"id\" : \"" + incomingJson.get("id") + "\",\n" +
                "  \"name\" : \"" + incomingJson.get("name") + "\",\n" +
                "  \"move\" : \"" + incomingJson.get("move") + "\",\n" +
                "  \"jump\" : \"" + incomingJson.get("jump") + "\",\n" +
                "  \"idCordsX\" : \"" + incomingJson.get("playerCordsX") + "\",\n" +
                "  \"idCordsY\" : \"" + incomingJson.get("playerCordsY") + "\",\n" +
                "  \"otherCordsX\" : \"" + incomingJson.get("enemyCordsX") + "\",\n" +
                "  \"otherCordsY\" : \"" + incomingJson.get("enemyCordsY") + "\"\n" +
                "}";
        // System.out.println("movementAnswer:" + answer);
        return answer;
    }

    /**
     * Request game start, game only starts once both players recieve msg that other is ready
     */
    @MessageMapping("/gameStartSignal")
    @SendTo("/game/play")
    public String playerSendStartSignal(String playerJSON) throws Exception {
        JSONObject incomingJson = new JSONObject(playerJSON);

        String answer = "{\n" +
                "  \"option\" : \"" + "signal" + "\",\n" +
                "  \"id\" : \"" + incomingJson.get("id") + "\",\n" +
                "  \"name\" : \"" + incomingJson.get("name") + "\"\n" +
                "}";
        return answer;
    }

    /**
     * Checks if both players are ready.
     */
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
