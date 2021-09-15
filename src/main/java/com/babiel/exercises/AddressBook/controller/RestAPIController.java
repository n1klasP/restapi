package com.babiel.exercises.AddressBook.controller;

import com.babiel.exercises.AddressBook.model.PersonModel;
import com.babiel.exercises.AddressBook.services.PersonService;
import exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestAPIController {

    @Autowired
    PersonService personService;

    @RequestMapping(value = "/api/v1/person", method = RequestMethod.GET)
    public List<PersonModel> getAllPersons() {
        return personService.findAll();
    }


    @RequestMapping(value = "/api/v1/person/{id}", method = RequestMethod.GET)
    public PersonModel getPersonByID(@PathVariable("id") Integer userID) {
        if (userID > getAllPersons().size()) {
            throw new NotFoundException.UserNotFoundException();
        }
        return personService.findAll().get(userID);
    }

    @RequestMapping(value = "/api/v1/person", method = RequestMethod.POST)
    @ResponseBody
    public HttpEntity createPerson(@RequestBody PersonModel personModel) {
        personService.add(personModel);
        return new ResponseEntity("User erfolgreich hinzugefügt", HttpStatus.CREATED);
    }

    @RequestMapping(value = "/api/v1/person/{id}", method = RequestMethod.PUT)
    public HttpEntity saveDetails(@PathVariable("id") Integer userID, @RequestBody PersonModel personModel) {
        personModel.setId(userID);
        personService.update(personModel);
        return new ResponseEntity("User wurde erfolgreich bearbeitet" + personModel, HttpStatus.MULTI_STATUS);
    }

    @RequestMapping(value = "/api/v1/person/{id}", method = RequestMethod.DELETE)
    public void deletePerson(@PathVariable("id") Integer userID) {
        if (userID > getAllPersons().size()) {
            throw new NotFoundException.UserNotFoundException();
        }
        personService.delete(userID);
    }


}