package com.spring.controller;

import com.google.gson.Gson;
import com.spring.Exeptions.UserExists;
import com.spring.player.RegisteredUser;
import com.spring.repository.RegisteredUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisteredUserController {

    @Autowired
    private RegisteredUserService registeredUserService;
    private Gson gson = new Gson();

    @RequestMapping(value = "register", method = RequestMethod.POST)
    public String addPlayerInDatabase(@RequestBody String playerInJson) {
        try {
            registeredUserService.addRegisteredUser(gson.fromJson(playerInJson, RegisteredUser.class));
            return "{   'success': true }";
        } catch (UserExists e) {
            e.printStackTrace();
            return "{   'success': false }";
        }
    }
    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String checkIfPlayerCanLogin(@RequestBody String playerInJson) {

        RegisteredUser registeredUser = gson.fromJson(playerInJson, RegisteredUser.class);
        if(registeredUserService.getRegisteredUser(registeredUser.getUsername()).getPassword().equals(registeredUser.getPassword())) {
            return "{   'success': true }";
        } else {
            return "{   'success': false }";
        }


    }

    @RequestMapping(value = "registered_user/update", method = RequestMethod.POST)
    public String updatePlayerInDatabase(@RequestBody String playerInJson) {
        try {
            registeredUserService.updateRegisteredUser(gson.fromJson(playerInJson, RegisteredUser.class));
            return "{   'success': true }";
        } catch (UserExists e) {
            e.printStackTrace();
            return "{   'success': false }";
        }
    }

    @RequestMapping(value = "registered_user/delete", method = RequestMethod.POST)
    public void deletePlayerInDatabase(@RequestBody String playerInJson) {

        registeredUserService.deleteRegisteredUser(gson.fromJson(playerInJson, RegisteredUser.class).getUsername());

    }

    @RequestMapping(value = "registered_user/get", method = RequestMethod.POST)
    public RegisteredUser getPlayerInDatabase(@RequestBody String playerInJson) {
        return registeredUserService.getRegisteredUser(gson.fromJson(playerInJson, RegisteredUser.class).getUsername());
    }
}
