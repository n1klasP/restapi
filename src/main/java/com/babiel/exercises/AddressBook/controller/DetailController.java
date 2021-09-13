package com.babiel.exercises.AddressBook.controller;

import com.babiel.exercises.AddressBook.model.PersonModel;
import com.babiel.exercises.AddressBook.repository.PersonModelJpaRepository;
import com.babiel.exercises.AddressBook.services.PersonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

import javax.validation.Valid;
import java.util.Locale;


@Controller
public class DetailController implements MessageSourceAware {

    @Autowired
    private PersonModelJpaRepository personModelRepository;

    @Autowired
    private PersonService personService;


    private static final Logger logger = LoggerFactory.getLogger(DetailController.class);

    private MessageSource messageSource;

    @Override
    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }


    @RequestMapping(value = "/person/{id}", method = RequestMethod.GET)
    public String person(Model model, @PathVariable("id") Integer userID) {
        System.out.println("ID is " + userID);
        model.addAttribute("person", personService.findAll().get(userID));
        return "detail";
    }


    @RequestMapping(value = "/person/{id}", method = RequestMethod.POST)
    public String saveDetails(SessionStatus sessionStatus, @PathVariable("id") Integer userID,
                              Model model, @Valid PersonModel person, BindingResult bindingResult, Locale locale
    ) {

        if (bindingResult.hasErrors()) {
            logger.error(messageSource.getMessage("error_form", null, locale));
            model.addAttribute("msg", "Added");
            model.addAttribute("person", person);
            return "detail";

        }
        model.addAttribute("msg", "Added");
        model.addAttribute("person", person);

        sessionStatus.setComplete();
        personService.update(person);
        return "redirect:/";
    }


}

