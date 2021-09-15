package com.babiel.exercises.AddressBook.persistence;

import com.babiel.exercises.AddressBook.model.PersonModel;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

/**
 * Created by p.okraku on 31.05.2019.
 */
public interface DataSource {
    List<PersonModel> findAll();

    void update(PersonModel updatedPerson);

    void add(PersonModel personModel);

    void delete(Integer id);

}
