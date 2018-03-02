package com.spring.controller;

import com.google.gson.Gson;
import com.spring.player.Player;
import org.springframework.web.bind.annotation.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

@RestController
public class PlayerController {

    @RequestMapping(value="user/create", method = RequestMethod.POST)
    public String addPlayerInDatabase(@RequestBody String playerInJson){
        Player player = updateDatabaseWithJson(playerInJson, "insert");

        return "Player X: " + player.getX() + " Player Y: " + player.getY() + " UID " + player.getUID() + " Created";
    }
    @RequestMapping(value="user/update", method = RequestMethod.POST)
    public String updatePlayerInDatabase(@RequestBody String playerInJson){
        Player player = updateDatabaseWithJson(playerInJson, "update");

        return "Player X: " + player.getX() + " Player Y: " + player.getY() + " UID UPDATED" + player.getUID() + " Updated";
    }
    @RequestMapping(value="user/delete", method = RequestMethod.POST)
    public String deletePlayerInDatabase(@RequestBody String playerInJson){
        Player player = updateDatabaseWithJson(playerInJson, "delete");

        return "Player X: " + player.getX() + " Player Y: " + player.getY() + " UID " + player.getUID() + " Deleted";
    }

    private Player updateDatabaseWithJson(String playerInJson, String method) {
        Gson gson = new Gson();
        Player player = gson.fromJson(playerInJson, Player.class);

        Connection connection;
        try {

            connection = DriverManager.getConnection("jdbc:h2:file:~/test", "sa",  "");
            Statement SQLStatement = connection.createStatement();
            if(method.equals("update")) {
                SQLStatement.executeUpdate("UPDATE Player SET X=" + player.getX() + " ,Y=" + player.getY() + "WHERE UID=" + player.getUID());
            } else if(method.equals("insert")) {
                SQLStatement.executeUpdate("INSERT INTO Player VALUES(" + player.getUID() + ","  + player.getX() + "," + player.getY() + ")");
            } else if(method.equals("delete")) {
                SQLStatement.executeUpdate("DELETE Player WHERE UID=" + player.getUID());
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return player;
    }

}
