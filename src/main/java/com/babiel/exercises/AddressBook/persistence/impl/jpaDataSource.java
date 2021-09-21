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
        persons = new ArrayList<>();
        List<PersonModel> personList = pmj.findAll();
        for (PersonModel pm : personList) {
            persons.add(pm);
        }
        return persons;
    }

    @Override
    public void update(PersonModel updatedPerson) {
        PersonModel personModel = pmj.getOne(updatedPerson.getId());
        personModel.setFirstName(updatedPerson.getFirstName());
        personModel.setLastName(updatedPerson.getLastName());
        personModel.setZipCode(updatedPerson.getZipCode());
        personModel.setStreet(updatedPerson.getStreet());
        personModel.setCity(updatedPerson.getCity());
        pmj.save(personModel);
    }

    public void add(PersonModel personModel) {
        pmj.save(personModel);
        System.out.println("New User Added");
    }

    @Override
    public void delete(Integer id) {
        persons.get(id);
        pmj.delete(persons.get(id));
    }

}

