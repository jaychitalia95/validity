package com.validity.service;
import com.validity.pojo.Person;
import info.debatty.java.stringsimilarity.Levenshtein;
import java.util.ArrayList;
import java.util.List;

public class FindDuplicateService {
    public List<Person> getDuplicates(List<Person> personData){
        List<Person> duplicatePersonData = new ArrayList<>();
        Levenshtein levenshtein = new Levenshtein();
        for(int i = 0; i<personData.size(); i++){
            for(int j=i+1; j<personData.size(); j++){
                if(levenshtein.distance(personData.get(i).getEmail(), personData.get(j).getEmail()) == 0 || levenshtein.distance(personData.get(i).getNumber(), personData.get(j).getNumber()) == 0 && levenshtein.distance(personData.get(i).getFirstName(), personData.get(j).getFirstName()) < 4 && levenshtein.distance(personData.get(i).getLastName(), personData.get(j).getLastName()) < 4){
                    duplicatePersonData.add(personData.get(i));
                    duplicatePersonData.add(personData.get(j));
                }
            }
        }
        return duplicatePersonData;
    }
}
