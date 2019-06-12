package AddressBook.services;

import AddressBook.model.PersonModel;

import java.util.List;

public interface PersonService {
    List<PersonModel> findAll();
    void update(PersonModel person);
}
