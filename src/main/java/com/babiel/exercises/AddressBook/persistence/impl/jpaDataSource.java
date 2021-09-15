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
        List<PersonModel> personList = pmj.findAll();
        for (PersonModel pm : personList) {
            persons.add(pm);
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

    public void add(PersonModel personModel) {
        pmj.save(personModel);
        System.out.println("New User Added");
    }

    @Override
    public void delete(PersonModel personModel) {
        persons.remove(personModel);
        pmj.delete(personModel);
    }
}

