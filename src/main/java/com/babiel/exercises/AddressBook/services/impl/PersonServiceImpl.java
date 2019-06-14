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
  private DataSource dataSource;

  @Override
  public List<PersonModel> findAll() {
    return dataSource.findAll();
  }

  @Override
  public void update(PersonModel person) {
    dataSource.update(person);
  }
}
