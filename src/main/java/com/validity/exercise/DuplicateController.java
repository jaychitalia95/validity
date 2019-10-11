package com.validity.exercise;

import com.validity.pojo.Person;
import com.validity.service.CsvReaderService;
import com.validity.service.FindDuplicateService;
import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DuplicateController {
    private CsvReaderService csvReaderService = new CsvReaderService();
    private FindDuplicateService findDuplicateService = new FindDuplicateService();
    @GetMapping(value = "/")
    public JSONObject getDuplicates(){
        List<Person> personData;
        List<Person> duplicatePersonData;
        personData = csvReaderService.readCsv("normal.csv");
        duplicatePersonData = findDuplicateService.getDuplicates(personData);
        personData.removeAll(duplicatePersonData);
        JSONObject result = new JSONObject();
        result.put("Duplicates", duplicatePersonData);
        result.put("Non Duplicates", personData);
        return result;

    }
}
