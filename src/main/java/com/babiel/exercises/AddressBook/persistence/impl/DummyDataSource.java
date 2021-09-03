package com.babiel.exercises.AddressBook.persistence.impl;

import com.babiel.exercises.AddressBook.model.PersonModel;
import com.babiel.exercises.AddressBook.persistence.DataSource;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by p.okraku on 31.05.2019.
 */
@Service
public class DummyDataSource implements DataSource {
    List<PersonModel> persons;

    @PostConstruct
    public void init() {
        persons = new ArrayList<>();
        persons.add(new PersonModel(0, "Max", "Mustermann", "Musterstraße 1", 12345, "Musterstadt"));
        persons.add(new PersonModel(1, "Marianne", "Musterfrau", "Musterstraße 3", 23456, "Musterstadt2"));
    }

    @Override
    public List<PersonModel> findAll() {
        return persons;
    }

    @Override
    public void update(PersonModel updatedPerson) {
        for (int i = 0; i < persons.size(); i++) {
            if (persons.get(i).getId() == updatedPerson.getId()) {
                persons.set(i, updatedPerson);
                break;
            }
        }
    }
}

