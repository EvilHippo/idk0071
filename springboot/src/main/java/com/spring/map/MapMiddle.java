package com.spring.map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.io.File;
import java.util.Arrays;
import java.util.Random;

public class MapMiddle extends Map {

    public void readOneRandomFileOfMiddlePlatformData() {
        int numberOfCreatedMapParts;
        try {
            numberOfCreatedMapParts = new File( PATH_TO_RESOURCE_FOLDER + "map_middle").list().length;
        } catch (NullPointerException e) {
            e.printStackTrace();
            numberOfCreatedMapParts = 5;  // current default value
        }
        String filePath = PATH_TO_RESOURCE_FOLDER + "map_middle\\map_middle_platfrom_data_" + (new Random().nextInt(numberOfCreatedMapParts) + 1) + ".txt";
        Gson gson = new Gson();
        setData(gson.fromJson(getReader().readFromFile(filePath), this.getClass()).getData());
    }
}
