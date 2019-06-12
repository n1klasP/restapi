package AddressBook.controller;

import AddressBook.model.GreetingModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by p.okraku on 31.05.2019.
 */
@Controller
public class JspExamplesController {
  @RequestMapping("/jsp-examples")
  public String greeting(Model model) {
    List<String> stringList = new ArrayList<>();
    stringList.add("one");
    stringList.add("two");
    stringList.add("three");
    stringList.add("four");
    stringList.add("five");

    GreetingModel greeting = new GreetingModel("Max", "Mustermann");
    model.addAttribute("greeting", greeting);
    model.addAttribute("stringList", stringList);
    return "jsp-examples";
  }
}
