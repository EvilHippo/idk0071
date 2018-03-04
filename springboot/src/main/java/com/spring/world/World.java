package com.spring.world;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.spring.platform.Platform;

import java.util.ArrayList;
import java.util.List;

public class World {
    private int width;
    private int height;
    private int biggestHeight = 0;
    private List<Platform> platforms = new ArrayList<>();
    @JsonIgnore
    private List<Platform> lastAddedPlatforms = new ArrayList<>();

    public int getBiggestHeight() {
        return biggestHeight;
    }

    public void setBiggestHeight(int biggestHeight) {
        this.biggestHeight = biggestHeight;
    }

    public World(int width, int height) {

        this.width = width;
        this.height = height;
    }

    public List<Platform> getPlatforms() {
        return platforms;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
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

    public void addPlatform(Platform platform) {
        lastAddedPlatforms.clear();
        platforms.add(platform);
        lastAddedPlatforms.add(platform);
        changeBiggestHeight((int)platform.getY());
    }
    public void addPlatform(List<Platform> platforms) {
        lastAddedPlatforms.clear();
        this.platforms.addAll(platforms);
        lastAddedPlatforms.addAll(platforms);
        changeBiggestHeight((int)platforms.get(platforms.size() - 1).getY());
    }
    private void changeBiggestHeight(int big) {
        if(big > biggestHeight) {
            biggestHeight = big;
        }
    }
}
