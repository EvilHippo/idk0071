package com.spring.map;

import com.google.gson.Gson;

import java.io.File;
import java.util.Random;

public class MapBeginning extends Map {

    public void readOneRandomFileOfBeginningPlatformData() {
        int numberOfCreatedMapParts;
        try {
            numberOfCreatedMapParts = new File(PATH_TO_RESOURCE_FOLDER + "map_beginning").list().length;
        } catch (NullPointerException e) {
            e.printStackTrace();
            numberOfCreatedMapParts = 1;  // current default value
        }
        String filePath = PATH_TO_RESOURCE_FOLDER + "map_beginning\\map_beginning_platfrom_data_" + (new Random().nextInt(numberOfCreatedMapParts) + 1) + ".txt";
        Gson gson = new Gson();
        setData(gson.fromJson(getReader().readFromFile(filePath), this.getClass()).getData());
    }
}
