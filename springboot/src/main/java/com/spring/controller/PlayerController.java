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


        return updateDatabaseWithJson(playerInJson, "update") + " Created";
    }
    @RequestMapping(value="user/update", method = RequestMethod.POST)
    public String updatePlayerInDatabase(@RequestBody String playerInJson){


        return updateDatabaseWithJson(playerInJson, "update") + " Updated";
    }
    @RequestMapping(value="user/delete", method = RequestMethod.POST)
    public String deletePlayerInDatabase(@RequestBody String playerInJson){


        return updateDatabaseWithJson(playerInJson, "update") + " Deleted";
    }

    private Player updateDatabaseWithJson(String playerInJson, String method) {
        Gson gson = new Gson();
        Player player = gson.fromJson(playerInJson, Player.class);

        Connection connection;
        try {

            connection = DriverManager.getConnection("jdbc:h2:file:~/test", "sa",  "");
            Statement SQLStatement = connection.createStatement();
            switch (method) {
                case "update":
                    SQLStatement.executeUpdate("UPDATE Player SET X=" + player.getX() + " ,Y=" + player.getY() + "WHERE UID=" + player.getUID());
                    break;
                case "insert":
                    SQLStatement.executeUpdate("INSERT INTO Player VALUES(" + player.getUID() + "," + player.getX() + "," + player.getY() + ")");
                    break;
                case "delete":
                    SQLStatement.executeUpdate("DELETE Player WHERE UID=" + player.getUID());
                    break;
                default:
                    throw new RuntimeException("Method does not match any supported methods: update, insert, delete");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return player;
    }

}
