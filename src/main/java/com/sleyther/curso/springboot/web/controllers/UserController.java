package com.sleyther.curso.springboot.web.controllers;

import com.sleyther.curso.springboot.web.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Controller
@RequestMapping("/web")
public class UserController {

  @GetMapping("/details")
  public String details(Model model) {
    User user = new User("Sleyther Giulio", "Calsin Pacsi");
    user.setEmail("sgcalsinpacsi@gmail.com");
    model.addAttribute("title", "Hola Mundo Spring Boot");
    model.addAttribute("user", user);
    return "details";
  }

  @GetMapping("/list")
  public String list(ModelMap model) {

//    model.addAttribute("users", usersModel());
    model.addAttribute("title", "Listado de usuarios");
    return "list";
  }

  @ModelAttribute("users")
  public List<User> usersModel() {
    return Arrays.asList(
      User.builder().name("Pepa").lastname("Gonzales").build(),
      User.builder().name("Lalo").lastname("Garcia").email("lalo@correo.com").build(),
      User.builder().name("Juanita").lastname("Roe").email("juanita@correo.com").build(),
      User.builder().name("Andres").lastname("Doe").build()
    );
  }


}
