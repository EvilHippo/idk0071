package com.spring.world;

import com.google.gson.Gson;
import com.spring.map.CompleteMap;
import com.spring.map.Map;
import com.spring.map.MapMiddle;
import console.draw.ConsoleDrawMap;

public class TestingMain {
    public static void main(String[] args) {
        //Gson gson = new Gson();
        //Map map = new MapMiddle("C:\\Users\\Door\\IdeaProjects\\idk0071\\springboot\\src\\main\\resources\\map_beginning\\map_beginning_platfrom_data_1.txt");
        //System.out.println(map.readFromFile());
        //Map map2 = gson.fromJson(map.readFromFile(), MapMiddle.class);
        //System.out.println(map2.getData());
        CompleteMap completeMap = new CompleteMap();
        completeMap.getJsonInTiledFormatWithDataInserted();
    }
}
