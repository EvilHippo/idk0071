package com.spring.controller;

import com.spring.platform.BasicPlatform;
import com.spring.platform.Platform;
import com.spring.world.World;
import console.draw.ConsoleDrawMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.List;

@RestController
public class WorldController {
    int id = 0;
    @RequestMapping("/world")
    public List<Platform> getWorld() {



        World world = new World(300, 100, 100);
        ConsoleDrawMap.drawMapIntoConsole(world);
        return world.getPlatforms();
    }
}
