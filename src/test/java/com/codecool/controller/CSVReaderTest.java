package com.codecool.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class CSVReaderTest {
    @Test
    void testNonFunctionalCSVRead() {
        String content = "Id,Name,FavoriteColor,\n" +
                "1,Jane,Green,\n" +
                "2,Thomas,Red,\n" +
                "3,Dexter,Yellow,\n" +
                "4,Margaret,Brown,\n" +
                "5,Ariana,Grey,\n";
        Assertions.assertEquals(content, CSVReader.nonFunctionalReadCSV(
                "/home/devas/AdvancedTW/SQLtheCSV/src/main/resources/data.csv"));
    }
    @Test
    void testReadCSVIf0LineEqualsGivenList(){
        String[] strings = new String[] { "Id", "Name", "FavoriteColor" };
        List<String> list = Arrays.asList(strings);
        Assertions.assertEquals(list, CSVReader.readCSVToListOfLists("/home/devas/AdvancedTW/SQLtheCSV/src/main/resources/data.csv").get(0));
    }
}