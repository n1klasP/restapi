package AddressBook.controller;

import AddressBook.model.PersonModel;
import AddressBook.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by p.okraku on 31.05.2019.
 */
@Controller
public class OverviewController {
  @Autowired
  private PersonService personService;

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public String getOverviewPage(Model model) {
    List<PersonModel> persons = personService.findAll();
    model.addAttribute("persons", persons);

    return "overview";
  }
}
