package com.codecool.controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {
// Non functional
    public static String nonFunctionalReadCSV(String filePath){

            List<List<String>> csvData = new ArrayList<>();
            StringBuilder contentBuilder = new StringBuilder();
            try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

                String sCurrentLine;
                while ((sCurrentLine = br.readLine()) != null) {
                    contentBuilder.append(sCurrentLine + "\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        return contentBuilder.toString();
    }

    public static List<List<String>> readCSVToListOfLists(String filePath) {

        String line = null;
        BufferedReader stream = null;
        List<List<String>> csvData = new ArrayList<List<String>>();

        try {
            stream = new BufferedReader(new FileReader(filePath));
            while ((line = stream.readLine()) != null) {
                String[] splitted = line.split(",");
                List<String> dataLine = new ArrayList<String>(splitted.length);
                for (String data : splitted)
                    dataLine.add(data);
                csvData.add(dataLine);


            }
            if (stream != null) {
                stream.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return csvData;

    }
}
