package com.validity.exercise;

import com.validity.pojo.Person;
import com.validity.service.CsvReaderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DuplicateController {
    private CsvReaderService csvReaderService = new CsvReaderService();
    @GetMapping(value = "/")
    public List<Person> printCsv(){
        return csvReaderService.readCsv("normal.csv");
    }
}
