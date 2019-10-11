package com.validity.service;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.validity.pojo.Person;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvReaderService {

    public List<Person> readCsv(String fileName) {
        List<Person> personData = new ArrayList<>();
        String[] data;
        try {
            CSVReader csvReader = new CSVReaderBuilder(new FileReader(fileName)).withSkipLines(1).build();
            try {
                while ((data = csvReader.readNext()) != null) {
                    Person person = new Person(data[0], data[1], data[2], data[3], data[4], data[5], data[6], data[7], data[8], data[9], data[10], data[11]);
                    personData.add(person);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return personData;
    }
}
