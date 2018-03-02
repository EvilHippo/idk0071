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

    @RequestMapping(value="user/start", method = RequestMethod.POST)
    public String addPlayerToDatabase(@RequestBody String payload){
        Player player = updateDatabaseWithJson(payload, "insert");

        return "Player X: " + player.getX() + " Player Y: " + player.getY() + " UID " + player.getUID();
    }
    @RequestMapping(value="user/update", method = RequestMethod.POST)
    public String updatePlayerToDatabase(@RequestBody String payload){
        Player player = updateDatabaseWithJson(payload, "update");

        return "Player X: " + player.getX() + " Player Y: " + player.getY() + " UID UPDATED" + player.getUID();
    }

    private Player updateDatabaseWithJson(String payload, String method) {
        Gson gson = new Gson();
        Player player = gson.fromJson(payload, Player.class);

        Connection connection;
        try {

            connection = DriverManager.getConnection("jdbc:h2:file:~/test", "sa",  "");
            Statement st = connection.createStatement();
            if(method.equals("update")) {
                st.executeUpdate("UPDATE Player SET X=" + player.getX() + " ,Y=" + player.getY() + "WHERE UID=" + player.getUID());
            } else if(method.equals("insert")) {
                st.executeUpdate("INSERT INTO Player VALUES(" + player.getUID() + ","  + player.getX() + "," + player.getY() + ")");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return player;
    }

}
