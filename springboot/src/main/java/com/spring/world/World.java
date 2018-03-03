package com.spring.world;

import com.spring.platform.Platform;

import java.util.ArrayList;
import java.util.List;

public class World {
    private List<Platform> platforms = new ArrayList<>();
    private List<Platform> lastAddedPlatforms = new ArrayList<>();

    public List<Platform> getPlatforms() {
        return platforms;
    }

    public void setPlatforms(List<Platform> platforms) {
        this.platforms = platforms;
    }

    public List<Platform> getLastAddedPlatforms() {
        return lastAddedPlatforms;
    }

    public void setLastAddedPlatforms(List<Platform> lastAddedPlatforms) {
        this.lastAddedPlatforms = lastAddedPlatforms;
    }

    private void addPlatform(Platform platform) {
        lastAddedPlatforms.clear();
        platforms.add(platform);
        lastAddedPlatforms.add(platform);
    }
    private void addPlatform(List<Platform> platforms) {
        lastAddedPlatforms.clear();
        this.platforms.addAll(platforms);
        lastAddedPlatforms.addAll(platforms);
    }
}
