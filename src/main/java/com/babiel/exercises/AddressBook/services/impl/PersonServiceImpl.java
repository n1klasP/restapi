package com.babiel.exercises.AddressBook.services.impl;

import com.babiel.exercises.AddressBook.model.PersonModel;
import com.babiel.exercises.AddressBook.persistence.DataSource;
import com.babiel.exercises.AddressBook.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by p.okraku on 31.05.2019.
 */
@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private DataSource addressBookDataSource;

    @Override
    public List<PersonModel> findAll() {
        return addressBookDataSource.findAll();
    }

    @Override
    public void update(PersonModel person) {
        addressBookDataSource.update(person);
    }

    @Override
    public void add(PersonModel person) {
        addressBookDataSource.add(person);
    }

    @Override
    public void delete(Integer id) {
        addressBookDataSource.delete(id);
    }
}
