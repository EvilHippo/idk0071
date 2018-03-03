package com.spring.controller;

import com.spring.platform.Platform;
import com.spring.world.WorldGenerator;
import console.draw.ConsoleDrawMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WorldController {
    int id = 0;
    @RequestMapping("/world")
    public List<Platform> getWorld() {



        WorldGenerator worldGenerator = new WorldGenerator(300, 100, 100);
        ConsoleDrawMap.drawMapIntoConsole(worldGenerator);
        return worldGenerator.getWorld().getPlatforms();
    }
}
