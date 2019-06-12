package AddressBook.controller;

import AddressBook.model.PersonModel;
import AddressBook.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by p.okraku on 31.05.2019.
 */
@Controller
public class DetailController {
  @Autowired
  private PersonService personService;

  @RequestMapping(value = "/person/{id}", method = RequestMethod.GET)
  public String getAddress(@PathVariable int id, Model model) {
    PersonModel person = personService.findAll().get(id);
    model.addAttribute("person", person);
    return "details";
  }

  @RequestMapping(value = "/person/{id}", method = RequestMethod.POST)
  public String postAddress(@PathVariable int id, @ModelAttribute("person") PersonModel person) {
    personService.update(person);
    return "redirect:/";
  }
}
