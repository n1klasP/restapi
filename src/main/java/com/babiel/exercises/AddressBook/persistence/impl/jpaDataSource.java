package com.babiel.exercises.AddressBook.persistence.impl;

import com.babiel.exercises.AddressBook.model.PersonModel;
import com.babiel.exercises.AddressBook.persistence.DataSource;
import com.babiel.exercises.AddressBook.repository.PersonModelJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by p.okraku on 31.05.2019.
 */
@Service
public class jpaDataSource implements DataSource {
    List<PersonModel> persons;
    @Autowired
    private PersonModelJpaRepository pmj;

    @PostConstruct
    public void init() {
        persons = new ArrayList<>();
        List<PersonModel> test = pmj.findAll();
        for (PersonModel p : test) {
            persons.add(p);
            System.out.println(p + "sss");
        }
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
                pmj.save(updatedPerson);
                break;
            }
        }
    }
}

