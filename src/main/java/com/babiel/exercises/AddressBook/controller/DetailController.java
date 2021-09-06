package com.babiel.exercises.AddressBook.controller;

import com.babiel.exercises.AddressBook.model.PersonModel;
import com.babiel.exercises.AddressBook.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.ConstraintViolation;
import javax.validation.Valid;
import javax.validation.Validator;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.StampedLock;


@Controller
public class DetailController {

    @Autowired
    private PersonService personService;
    private Integer userID;
    private Validator validator;



    @RequestMapping(value = "/person/{id}", method = RequestMethod.GET)
    public String person(Model model, @PathVariable("id") Integer userID) {
        this.userID = userID;
        System.out.println("ID is " + userID);
        model.addAttribute("person",personService.findAll().get(userID));
        return "detail";
    }


    @RequestMapping(value =  "/person/{id}",  method = RequestMethod.POST)
    public String saveDetails(SessionStatus sessionStatus, @PathVariable("id") Integer userID,
                              Model model,@Valid PersonModel person, BindingResult bindingResult ) {

        if(bindingResult.hasErrors())
        {
            model.addAttribute("msg", "Added");
            model.addAttribute("person", person);
            return "detail";

        }
        model.addAttribute("msg", "Added");
        model.addAttribute("person", person);

        sessionStatus.setComplete();
        personService.update(person);
        return "redi";
    }


}

