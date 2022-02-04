package br.com.druidess.person;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/people")
public class PersonResource {

  @GetMapping("/name")
  public String getName() {
    return "Eduardo";
  }

}
