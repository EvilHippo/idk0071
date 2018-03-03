package com.spring.world;

import com.spring.platform.BasicPlatform;
import com.spring.platform.Platform;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WorldGenerator {
    private Random random = new Random();
    private int width;
    private int height;
    private int numberOfPlatforms;
    public static final int PLATFORM_NUMBER_OF_PIXELS = 20;
    public static final int MINIMUM_DISTANCE_BETWEEN_PLATFORMS = 3;
    public static final int MAXIMUM_DISTANCE_BETWEEN_PLATFORMS = 5;
    public static final int MAXIMUM_NUMBER_OF_PLATFORM_NEXT_TO_EACH_OTHER = 3;

    private World world = new World();
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

    public int getNumberOfPlatforms() {
        return numberOfPlatforms;
    }

    public void setNumberOfPlatforms(int numberOfPlatforms) {
        this.numberOfPlatforms = numberOfPlatforms;
    }

    public World getWorld() {
        return world;
    }

    public void setWorld(World world) {
        this.world = world;
    }

    public WorldGenerator(int width, int height, int numberOfPlatforms) {

        this.width = width;
        this.height = height;
        this.numberOfPlatforms = numberOfPlatforms;

        world.getPlatforms().addAll(generateWorld(new ArrayList<>()));
        /*
        platforms.addAll(generateWorld(new ArrayList<>()));
        platforms.addAll(generateWorld(new ArrayList<>()));
        platforms.addAll(generateWorld(new ArrayList<>()));
        platforms.addAll(generateWorld(new ArrayList<>()));
        platforms.addAll(generateWorld(new ArrayList<>()));
        platforms.addAll(generateWorld(new ArrayList<>()));
        platforms.addAll(generateWorld(new ArrayList<>()));
        platforms.addAll(generateWorld(new ArrayList<>()));
        platforms.addAll(generateWorld(new ArrayList<>()));
        platforms.addAll(generateWorld(new ArrayList<>()));
        platforms.addAll(generateWorld(new ArrayList<>()));
        */
        printCoordinates();
    }




    private List<Platform> generateWorld(List<Platform> platforms) {
        for (int i = 0; i < numberOfPlatforms; i++) {
            createPlatForm(platforms);
        }
        return platforms;
    }

    private void createPlatForm(List<Platform> platforms) {

        int y = (random.nextInt(MAXIMUM_DISTANCE_BETWEEN_PLATFORMS) + MINIMUM_DISTANCE_BETWEEN_PLATFORMS) * PLATFORM_NUMBER_OF_PIXELS;

        int numberOfPlatforms = random.nextInt(MAXIMUM_NUMBER_OF_PLATFORM_NEXT_TO_EACH_OTHER) + 2;
        if(platforms.isEmpty()) {
            int x = random.nextInt((int)(width * 0.8) / PLATFORM_NUMBER_OF_PIXELS) * PLATFORM_NUMBER_OF_PIXELS + (int)(width * 0.1);
            y = random.nextInt(MAXIMUM_DISTANCE_BETWEEN_PLATFORMS) * PLATFORM_NUMBER_OF_PIXELS;
            platforms.add(new BasicPlatform(x , y));
        } else {
            addPlatfromsToList(platforms, y, numberOfPlatforms);
        }

    }

    private void addPlatfromsToList(List<Platform> platforms, int y, int numberOfPlatforms) {
        double lastPlacedPlatformX = platforms.get(platforms.size() - 1).getX() + (Math.pow(-1, random.nextInt(5) + 1) * ((random.nextInt(10)) * PLATFORM_NUMBER_OF_PIXELS));
        double lastPlacedPlatformY = platforms.get(platforms.size() - 1).getY();
        for (int i = 0; i < numberOfPlatforms; i++) {
            int totalX = (int)(i * PLATFORM_NUMBER_OF_PIXELS + lastPlacedPlatformX);
            if(totalX > width) {
                while (totalX > width) {
                    totalX -= (random.nextInt(3) + 1) * PLATFORM_NUMBER_OF_PIXELS;
                }
            } else if(0 > totalX) {
                while (0 > totalX) {
                    totalX += (random.nextInt(3) + 1) * PLATFORM_NUMBER_OF_PIXELS;
                }
            }
            platforms.add(new BasicPlatform(totalX, y + lastPlacedPlatformY));
        }
    }

    private void printCoordinates() {
        for (Platform platform :
                world.getPlatforms()) {
            System.out.println("X: " + platform.getX() + " Y: " + platform.getY());
        }
    }
}