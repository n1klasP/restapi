package com.babiel.exercises.AddressBook.repository;

import com.babiel.exercises.AddressBook.model.PersonModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonModelJpaRepository extends JpaRepository<PersonModel, Long> {
}
