package com.spring.controller;

import com.spring.platform.BasicPlatform;
import com.spring.platform.Platform;
import com.spring.world.World;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class WorldController {
    @RequestMapping("/world")
    public List<Platform> getWorld() {
        return new World(Arrays.asList(new BasicPlatform(100, 100),
                new BasicPlatform(250, 150),
                new BasicPlatform(300, 400)))
                .getPlatforms();
    }
}
