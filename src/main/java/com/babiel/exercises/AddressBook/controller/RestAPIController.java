package com.babiel.exercises.AddressBook.controller;

import com.babiel.exercises.AddressBook.model.PersonModel;
import com.babiel.exercises.AddressBook.services.PersonService;
import exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestAPIController {

    @Autowired
    PersonService personService;

    @RequestMapping(value = "/api/v1/person", method = RequestMethod.GET)
    public List<PersonModel> getAllPersons()
    {
        return personService.findAll();
    }


    @RequestMapping(value = "/api/v1/person/{id}", method = RequestMethod.GET)
    public PersonModel getPersonByID(@PathVariable("id") Integer userID)
    {
        return personService.findAll().get(userID);
    }

    @RequestMapping(value = "/api/v1/person", method = RequestMethod.POST)
    public void createPerson(@RequestBody PersonModel personModel)
    {
        personService.add(personModel);
    }

    @RequestMapping(value = "/api/v1/person/{id}", method = RequestMethod.POST)
    public void saveDetails(@PathVariable("id") Integer userID, @RequestBody PersonModel personModel)
    {
        personModel.setId(userID);
        personService.update(personModel);
    }

    @RequestMapping(value = "/api/v1/person/{id}", method = RequestMethod.DELETE)
    public void deletePerson(@PathVariable("id") Integer userID, @RequestBody PersonModel personModel)
    {
        personModel.setId(userID);
        personService.delete(personModel);
    }






}