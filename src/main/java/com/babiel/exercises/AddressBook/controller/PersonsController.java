package com.babiel.exercises.AddressBook.controller;

import com.babiel.exercises.AddressBook.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PersonsController {

    @Autowired
    private PersonService personService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String person(Model model) {
        model.addAttribute("person", personService.findAll());
        return "persons";
    }
}
