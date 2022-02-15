package br.com.druidess.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/people")
public class PersonResource {

  @Autowired
  private RestTemplate restTemplate;

  @GetMapping("/name")
  public String getName() {
    String telefone = restTemplate.getForObject("http://DANTE-SERVICE/dante/phone", String.class);

    return "Eduardo" + telefone;
  }

}
