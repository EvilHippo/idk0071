package com.spring.world;

import console.draw.ConsoleDrawMap;

public class TestingMain {
    public static void main(String[] args) {
        WorldGenerator worldGenerator = new WorldGenerator(800 , 10000, 100);
        ConsoleDrawMap.drawMapIntoConsole(worldGenerator);
    }
}
