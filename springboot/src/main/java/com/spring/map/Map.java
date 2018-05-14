package com.spring.map;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.spring.utility.FileReaderJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public abstract class Map {
    private List<Integer> data = new ArrayList<>();
    private FileReaderJson reader = new FileReaderJson();
    public static final String PATH_TO_RESOURCE_FOLDER = "C:\\Users\\Martin Karjus\\IdeaProjects\\idk0071\\springboot\\src\\main\\resources\\";

    public FileReaderJson getReader() {
        return reader;
    }

    public void setReader(FileReaderJson reader) {
        this.reader = reader;
    }

    public List<Integer> getData() {
        return data;
    }

    public void setData(List<Integer> data) {
        this.data = data;
    }

    public JsonArray addAllDataElementsToJsonArray(JsonArray jsonArray) {
        for (Integer coordinatesOfPlatforms : data) {
            jsonArray.add(coordinatesOfPlatforms);
        }
        return jsonArray;
    }


}
