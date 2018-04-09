package com.spring.utility;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderJson {


    public String readFromFile(String filePath) {
        BufferedReader reader = null;
        String allLines = "";
        try {
            File file = new File(filePath);
            reader = new BufferedReader(new java.io.FileReader(file));

            String line;
            while ((line = reader.readLine()) != null) {
                allLines += line;
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return allLines;
    }
}
