package AddressBook.controller;

import AddressBook.model.GreetingModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by p.okraku on 31.05.2019.
 */
@Controller
public class HelloController {
  @RequestMapping("/hello")
  public String greeting(Model model) {
    GreetingModel greeting = new GreetingModel("Max", "Mustermann");
    model.addAttribute("greeting", greeting);
    return "greeting";
  }
}
