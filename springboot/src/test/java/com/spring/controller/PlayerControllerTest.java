package com.spring.controller;

import com.google.gson.JsonArray;
import com.spring.player.Player;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerControllerTest {
    private PlayerController controller;

    @Before
    public void setUp() throws Exception {
        controller = new PlayerController();
    }

    @Test
    public void mapTest() {
        controller.addPlayerInDatabase("{'UID':123}");
        controller.addPlayerInDatabase("{'UID':1234}");
        Player player = controller.getPlayerToPlay("{'UID':123}").get(0);
        assertNotEquals(null, player.getMap());
    }

}