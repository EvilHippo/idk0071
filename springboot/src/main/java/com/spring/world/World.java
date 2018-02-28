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
    public static final int MINIMUM_DISTANCE_BETWEEN_PLATFORMS = 2 * PLATFORM_NUMBER_OF_PIXELS;
    public static final int MAXIMUM_DISTANCE_BETWEEN_PLATFORMS = 2 * PLATFORM_NUMBER_OF_PIXELS;
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
        generateWorld();
    }
    public World(List<Platform> platforms) {

        this.platforms = platforms;
    }



    private void generateWorld() {
        for (int i = 0; i < numberOfPlatforms; i++) {
            createPlatForm();
        }
    }

    private void createPlatForm() {
        int x = new Random().nextInt(width) / PLATFORM_NUMBER_OF_PIXELS;
        int y = new Random().nextInt(MAXIMUM_DISTANCE_BETWEEN_PLATFORMS) + MINIMUM_DISTANCE_BETWEEN_PLATFORMS;
        int numberOfPlatforms = new Random().nextInt(MAXIMUM_NUMBER_OF_PLATFORM_NEXT_TO_EACH_OTHER) + 2;
        if(platforms.isEmpty()) {
            for (int i = 0; i < numberOfPlatforms; i++) {
                platforms.add(new BasicPlatform(x + i * PLATFORM_NUMBER_OF_PIXELS, y + i * PLATFORM_NUMBER_OF_PIXELS));
            }
        } else {
            double lastPlacedPlatformX = platforms.get(platforms.size() - 1).getX();
            double lastPlacedPlatformY = platforms.get(platforms.size() - 1).getY();
            for (int i = 0; i < numberOfPlatforms; i++) {
                int totalX = (int)(x + i * PLATFORM_NUMBER_OF_PIXELS + lastPlacedPlatformX);
                if(totalX > width) {
                    totalX -= totalX - width;
                }
                platforms.add(new BasicPlatform(totalX, y + i * PLATFORM_NUMBER_OF_PIXELS + lastPlacedPlatformY));
            }
        }
    }
}
