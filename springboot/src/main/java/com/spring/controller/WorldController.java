package com.spring.controller;

import com.spring.platform.BasicPlatform;
import com.spring.platform.Platform;
import com.spring.world.World;
import com.spring.world.WorldGenerator;
import console.draw.ConsoleDrawMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class WorldController {
    @RequestMapping("/world")
    public World getWorld() {



        WorldGenerator worldGenerator = new WorldGenerator(800, 1200, 10);
        ConsoleDrawMap.drawMapIntoConsole(worldGenerator);
        return worldGenerator.getWorld();
    }
}
