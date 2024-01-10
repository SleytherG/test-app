package com.sleyther.curso.springboot.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

  @GetMapping({"", "/", "/home"})
  public String home() {
    return "redirect:/web/list";
//    return "forward:/web/list";
  }

}
