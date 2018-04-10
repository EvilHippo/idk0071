package com.spring.map;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CompleteMapTest {
    CompleteMap completeMap;
    JsonObject jsonObject;
    Gson gson;
    @Before
    public void setUp() throws Exception {
        completeMap = new CompleteMap();
        gson = new Gson();
        jsonObject = new JsonObject();
    }

    @Test
    public void testJsonInTiledFormatWithDataInsertedIsNotEmpty() {
        assertEquals(false, completeMap.getJsonInTiledFormatWithDataInserted().isEmpty());
    }
    @Test
    public void testJsonInTiledFormatWithDataInsertedStartsWithCorrectJsonFormat() {
        assertEquals(true, completeMap.getJsonInTiledFormatWithDataInserted().startsWith("{"));
    }
    @Test
    public void testJsonInTiledFormatWithDataInsertedEndsWithCorrectJsonFormat() {
        assertEquals(true, completeMap.getJsonInTiledFormatWithDataInserted().endsWith("}"));
    }

    @Test
    public void testJsonInTiledFormatWithDataInsertedHasParameterHeight() {

        JsonObject jsonObject = gson.fromJson(completeMap.getJsonInTiledFormatWithDataInserted(), JsonObject.class);
        assertEquals(true, jsonObject.has("height"));
    }
    @Test
    public void testJsonInTiledFormatWithDataInsertedHasParameterLayers() {

        JsonObject jsonObject = gson.fromJson(completeMap.getJsonInTiledFormatWithDataInserted(), JsonObject.class);
        assertEquals(true, jsonObject.has("layers"));
    }
    @Test
    public void testJsonInTiledFormatWithDataInsertedWhetherDataHasBeenInserted() {
        JsonObject jsonObject = gson.fromJson(completeMap.getJsonInTiledFormatWithDataInserted(), JsonObject.class);
        assertEquals(JsonArray.class, jsonObject.getAsJsonArray("layers").get(0).getAsJsonObject().get("data").getClass());

    }
}