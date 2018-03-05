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

    public static final int PLATFORM_NUMBER_OF_PIXELS = 50;

    public static final int MINIMUM_DISTANCE_BETWEEN_PLATFORMS = 3;

    public static final int MAXIMUM_DISTANCE_BETWEEN_PLATFORMS = 5;

    public static final int MAXIMUM_NUMBER_OF_PLATFORM_NEXT_TO_EACH_OTHER = 3;
    public static final int MINIMUM_NUMBER_OF_PLATFORM_NEXT_TO_EACH_OTHER = 2;

    private World world;
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
        world = new World(width);
        this.numberOfPlatforms = numberOfPlatforms;
        world.addPlatform(generateWorld(new ArrayList<>()));
        world.addPlatform(generateWorld(new ArrayList<>()));
        world.addPlatform(generateWorld(new ArrayList<>()));
        world.addPlatform(generateWorld(new ArrayList<>()));
        world.addPlatform(generateWorld(new ArrayList<>()));
        world.addPlatform(generateWorld(new ArrayList<>()));
        placePlatFormsOnTheSidesAndBottom();
        printCoordinates();
        invertYAxis();
    }




    private List<Platform> generateWorld(List<Platform> platforms) {
        for (int i = 0; i < numberOfPlatforms; i++) {
            createPlatForm(platforms);
        }
        return platforms;
    }

    private void createPlatForm(List<Platform> platforms) {
        int y = (random.nextInt(MAXIMUM_DISTANCE_BETWEEN_PLATFORMS) + MINIMUM_DISTANCE_BETWEEN_PLATFORMS) * PLATFORM_NUMBER_OF_PIXELS;
        int numberOfPlatforms = random.nextInt(MAXIMUM_NUMBER_OF_PLATFORM_NEXT_TO_EACH_OTHER) + MINIMUM_NUMBER_OF_PLATFORM_NEXT_TO_EACH_OTHER;
        if(platforms.isEmpty()) {
            int x = random.nextInt((int)(width * 0.6) / PLATFORM_NUMBER_OF_PIXELS) * PLATFORM_NUMBER_OF_PIXELS + (int)(width * 0.2);
            y = random.nextInt(MAXIMUM_DISTANCE_BETWEEN_PLATFORMS) * PLATFORM_NUMBER_OF_PIXELS;
            platforms.add(new BasicPlatform(x , y, "platform.jpg"));
        } else {
            addPlatformsToList(platforms, y, numberOfPlatforms);
        }

    }


    private void addPlatformsToList(List<Platform> platforms, int y, int numberOfPlatforms) {
        double lastPlacedPlatformX = platforms.get(platforms.size() - 1).getX() + getNextPlatformsXCoordinateDifference();
        double lastPlacedPlatformY = platforms.get(platforms.size() - 1).getY();
        while (lastPlacedPlatformX > width * 0.9 - PLATFORM_NUMBER_OF_PIXELS * 0.5) {
            lastPlacedPlatformX -= (random.nextInt(3) + 1) * PLATFORM_NUMBER_OF_PIXELS;
        }

        while (PLATFORM_NUMBER_OF_PIXELS * 0.5 + width * 0.1 > lastPlacedPlatformX) {
            lastPlacedPlatformX += (random.nextInt(3) + 1) * PLATFORM_NUMBER_OF_PIXELS;
        }
        for (int i = 0; i < numberOfPlatforms; i++) {
            int totalX = (int)(i * PLATFORM_NUMBER_OF_PIXELS + lastPlacedPlatformX);
            if(totalX > width - PLATFORM_NUMBER_OF_PIXELS * 0.5 || PLATFORM_NUMBER_OF_PIXELS * 0.5 > totalX) {
                break;
            }


            platforms.add(new BasicPlatform(totalX, y + lastPlacedPlatformY, "platform.png"));
        }
    }

    private double getNextPlatformsXCoordinateDifference() {
        return Math.pow(-1, random.nextInt(5) + 1) * ((random.nextInt(10) + 1) * PLATFORM_NUMBER_OF_PIXELS);
    }

    private void printCoordinates() {
        for (Platform platform :
                world.getPlatforms()) {
            System.out.println("X: " + platform.getX() + " Y: " + platform.getY());
        }
    }

    public void placePlatFormsOnTheSidesAndBottom() {
        for (int y = world.getBiggestHeight() / PLATFORM_NUMBER_OF_PIXELS; y >= 0; y--) {

            for (int x = 0; x <= width; x++) {
                //System.out.println(x);
                if(x == 0 || x == width) {
                    world.addPlatform(new BasicPlatform(x, y * PLATFORM_NUMBER_OF_PIXELS, "side.png"));
                } else if(y == 0 && x % PLATFORM_NUMBER_OF_PIXELS == 0 || y * PLATFORM_NUMBER_OF_PIXELS == world.getBiggestHeight() && x % PLATFORM_NUMBER_OF_PIXELS == 0) {
                    world.addPlatform(new BasicPlatform(x, y * PLATFORM_NUMBER_OF_PIXELS, "ground.png"));

                }

            }


        }

    }
    public void invertYAxis() {
        for (Platform platform : world.getPlatforms()) {
            platform.setY(world.getBiggestHeight() - platform.getY());

        }
    }

}
