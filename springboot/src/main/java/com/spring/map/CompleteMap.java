package com.spring.map;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.spring.utility.FileReaderJson;

public class CompleteMap {

    public static final int NUMBER_OF_MIDDLE_PARTS = 7;
    public static final int NUMBER_OF_BEGINNING_PARTS = 1;

    public String getJsonInTiledFormatWithDataInserted() {

        Gson gson = new Gson();

        FileReaderJson fileReaderJson = new FileReaderJson();

        JsonObject jsonObject = gson.fromJson(fileReaderJson.readFromFile("C:\\Users\\Door\\IdeaProjects\\idk0071\\springboot\\src\\main\\resources\\map\\mapTemplate.txt"), JsonObject.class);
        JsonArray jsonArray = new JsonArray();
        // Adds all middle platform data to json array, currently map size is 100 blocks, each part consists of 25 blocks, so 3 * 25 middle blocks + 25 beginning blocks = 100
        for (int numberOfRandomMapParts = 0; numberOfRandomMapParts < NUMBER_OF_MIDDLE_PARTS; numberOfRandomMapParts++) {
            MapMiddle map = new MapMiddle();
            map.readOneRandomFileOfMiddlePlatformData();
            map.addAllDataElementsToJsonArray(jsonArray);
        }
        // Adds all beginning platform data to json array
        for (int numberOfRandomMapParts = 0; numberOfRandomMapParts < NUMBER_OF_BEGINNING_PARTS; numberOfRandomMapParts++) {
            MapBeginning map = new MapBeginning();
            map.readOneRandomFileOfBeginningPlatformData();
            map.addAllDataElementsToJsonArray(jsonArray);
        }

        jsonObject.getAsJsonArray("layers").get(0).getAsJsonObject().getAsJsonArray("data").addAll(jsonArray); // adding all platform data to the map template
        return jsonObject.toString();
    }

}
