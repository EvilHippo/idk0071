package com.spring.world;

import com.spring.platform.BasicPlatform;
import com.spring.platform.Platform;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class World {
    private int width;
    private int height;
    private int numberOfPlatforms;
    public static final int PLATFORM_NUMBER_OF_PIXELS = 10;
    public static final int MINIMUM_DISTANCE_BETWEEN_PLATFORMS = 3;
    public static final int MAXIMUM_DISTANCE_BETWEEN_PLATFORMS = 5;
    public static final int MAXIMUM_NUMBER_OF_PLATFORM_NEXT_TO_EACH_OTHER = 3;
    private List<Platform> platforms = new ArrayList<>();

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

    public List<Platform> getPlatforms() {
        return platforms;
    }

    public void setPlatforms(List<Platform> platforms) {
        this.platforms = platforms;
    }

    public World(int width, int height, int numberOfPlatforms) {

        this.width = width;
        this.height = height;
        this.numberOfPlatforms = numberOfPlatforms;

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
        platforms.addAll(generateWorld(new ArrayList<>()));
        printCoordinates();
    }
    public World(List<Platform> platforms) {

        this.platforms = platforms;
    }



    private List<Platform> generateWorld(List<Platform> platforms) {
        for (int i = 0; i < numberOfPlatforms; i++) {
            createPlatForm(platforms);
        }
        return platforms;
    }

    private void createPlatForm(List<Platform> platforms) {

        int y = (new Random().nextInt(MAXIMUM_DISTANCE_BETWEEN_PLATFORMS) + MINIMUM_DISTANCE_BETWEEN_PLATFORMS) * PLATFORM_NUMBER_OF_PIXELS;

        int numberOfPlatforms = new Random().nextInt(MAXIMUM_NUMBER_OF_PLATFORM_NEXT_TO_EACH_OTHER) + 2;

        if(platforms.isEmpty()) {
            int x = 10 + new Random().nextInt(80) * PLATFORM_NUMBER_OF_PIXELS;
            y = 10;
            platforms.add(new BasicPlatform(x , y));


        } else {
            double lastPlacedPlatformX = platforms.get(platforms.size() - 1).getX() + (Math.pow(-1, new Random().nextInt(5) + 1) * ((new Random().nextInt(10)) * PLATFORM_NUMBER_OF_PIXELS));
            System.out.println((Math.pow(-100, new Random().nextInt(2) + 1) * ((new Random().nextInt(3) + 3) * PLATFORM_NUMBER_OF_PIXELS)));
            double lastPlacedPlatformY = platforms.get(platforms.size() - 1).getY();
            for (int i = 0; i < numberOfPlatforms; i++) {
                int totalX = (int)(i * PLATFORM_NUMBER_OF_PIXELS + lastPlacedPlatformX);
                if(totalX > width) {
                    while (totalX > width) {
                        totalX -= (new Random().nextInt(2) + 1) * PLATFORM_NUMBER_OF_PIXELS;
                    }
                } else if(0 > totalX) {
                    while (0 > totalX) {
                        totalX += (new Random().nextInt(2) + 1) * PLATFORM_NUMBER_OF_PIXELS;
                    }
                }
                platforms.add(new BasicPlatform(totalX, y + lastPlacedPlatformY));
            }
        }

    }
    private void printCoordinates() {
        for (Platform platform :
                platforms) {
            System.out.println("X: " + platform.getX() + " Y: " + platform.getY());
        }
    }
}
