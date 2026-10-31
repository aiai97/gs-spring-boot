package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @GetMapping("/")
  public String index() {
    return "Greetings from Spring Boot!";
  }


  @GetMapping("/hello")
  public String leslie() {
    return "Greetings from Leslie!";
  }

  @GetMapping("/leslie")
  public String leslie2() {
    return "Leslie is happily coding!";
  }


}
