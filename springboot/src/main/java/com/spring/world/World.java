package com.spring.world;

import com.spring.platform.Platform;

import java.util.ArrayList;
import java.util.List;

public class World {
    private List<Platform> platforms = new ArrayList<>();

    public List<Platform> getPlatforms() {
        return platforms;
    }

    public void setPlatforms(List<Platform> platforms) {
        this.platforms = platforms;
    }

    public World(List<Platform> platforms) {

        this.platforms = platforms;
    }
    private void generateWorld() {

    }
}
