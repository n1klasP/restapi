package com.babiel.exercises.AddressBook.persistence.impl;

import com.babiel.exercises.AddressBook.model.PersonModel;
import com.babiel.exercises.AddressBook.persistence.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Created by p.okraku on 31.05.2019.
 */
@Service
public class jdbcDataSource implements DataSource {
    List<PersonModel> persons;
    @Autowired
    JdbcTemplate jdbc;

    @PostConstruct
    public void init() {

        String sql = "SELECT * FROM PERSON";

        persons = jdbc.query(sql, (resultSet, i) -> {
            PersonModel personModel = new PersonModel();
            personModel.setId(resultSet.getLong("id"));
            personModel.setFirstName(resultSet.getString("first_Name"));
            personModel.setLastName(resultSet.getString("last_Name"));
            personModel.setStreet(resultSet.getString("street"));
            personModel.setZipCode(resultSet.getInt("zip_Code"));
            personModel.setCity(resultSet.getString("city"));
            return personModel;
        });
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

    @Override
    public void add(PersonModel personModel) {

    }

    @Override
    public void delete(Integer id) {

    }
}

