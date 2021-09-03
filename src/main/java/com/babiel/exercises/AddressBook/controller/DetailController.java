package com.babiel.exercises.AddressBook.controller;

import com.babiel.exercises.AddressBook.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;


@Controller
public class DetailController {

    @Autowired
    private PersonService personService;



    @RequestMapping("/person/{id}")
    public String person(Model model,@PathVariable("id") Integer userID) {
            System.out.println("ID is " + userID);
            model.addAttribute("person",personService.findAll().get(userID));
            return "detail";
    }

    }

