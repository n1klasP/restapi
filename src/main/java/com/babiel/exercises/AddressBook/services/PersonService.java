package com.babiel.exercises.AddressBook.services;

import com.babiel.exercises.AddressBook.model.PersonModel;

import java.util.List;

public interface PersonService {
    List<PersonModel> findAll();
    void update(PersonModel person);
      void add(PersonModel person);
      void delete(Integer id);
}
