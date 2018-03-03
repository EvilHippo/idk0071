package com.spring.controller;

import com.google.gson.Gson;
import com.spring.player.Player;
import org.springframework.web.bind.annotation.*;

import java.sql.*;

@RestController
public class PlayerController {

    @RequestMapping(value="user/create", method = RequestMethod.POST)
    public Player addPlayerInDatabase(@RequestBody String playerInJson){


        return updateDatabaseWithJson(playerInJson, "insert");
    }
    @RequestMapping(value="user/update", method = RequestMethod.POST)
    public Player updatePlayerInDatabase(@RequestBody String playerInJson){


        return updateDatabaseWithJson(playerInJson, "update");
    }
    @RequestMapping(value="user/delete", method = RequestMethod.POST)
    public Player deletePlayerInDatabase(@RequestBody String playerInJson){


        return updateDatabaseWithJson(playerInJson, "delete");
    }
    @RequestMapping(value="user/get", method = RequestMethod.POST)
    public Player getPlayerInDatabase(@RequestBody String playerInJson){


        return updateDatabaseWithJson(playerInJson, "get");
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
                    SQLStatement.executeUpdate("INSERT INTO Player(UID, X, Y) VALUES(" + player.getUID() + "," + player.getX() + "," + player.getY() + ")");
                    break;
                case "delete":
                    SQLStatement.executeUpdate("DELETE Player WHERE UID=" + player.getUID());
                    break;
                case "get":
                    getPlayerByUIDFromDatabase(player, SQLStatement);
                    break;
                default:
                    throw new RuntimeException("Method does not match any supported methods: update, insert, delete, get");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return player;
    }

    private void getPlayerByUIDFromDatabase(Player player, Statement SQLStatement) throws SQLException {
        ResultSet resultOfQuery = SQLStatement.executeQuery("Select * FROM Player WHERE UID=" + player.getUID());
        while(resultOfQuery.next()) {
            player.setUID(resultOfQuery.getInt("UID"));
            player.setX(resultOfQuery.getInt("X"));
            player.setY(resultOfQuery.getInt("Y"));
        }
    }

}
