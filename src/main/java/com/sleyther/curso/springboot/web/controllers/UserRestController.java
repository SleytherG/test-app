package com.sleyther.curso.springboot.web.controllers;

import com.sleyther.curso.springboot.web.dto.UserDTO;
import com.sleyther.curso.springboot.web.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;


@RestController
@RequestMapping("/api")
public class UserRestController {

  @GetMapping("/details")
  public UserDTO details() {
    User user = new User("Sleyther Giulio", "Calsin Pacsi", "sgcalsinpacsi@gmail.com");
    UserDTO userDTO = new UserDTO();
    userDTO.setTitle("Hola Mundo Spring Boot");
    userDTO.setUser(user);
    return userDTO;
  }

  @GetMapping("/list")
  public List<User> list() {
    User user = new User("Sleyther Giulio", "Calsin Pacsi","sgcalsinpacsi@gmail.com");
    User user2 = new User("Andres", "Doe", "adoe@gmail.com");
    User user3 = new User("Pepe", "Doe", "pepe@doe.com");
    List<User> users = Arrays.asList(user, user2, user3);
//    List<User> users = new ArrayList<>();
//    users.add(user);
//    users.add(user2);
//    users.add(user3);
    return users;
  }

  @GetMapping("/lista")
  public List<User> lista() {
    User user = new User("Sleyther Giulio", "Calsin Pacsi","sgcalsinpacsi@gmail.com");
    User user2 = new User("Andres", "Doe", "adoe@gmail.com");
    User user3 = new User("Pepe", "Doe", "pepe@doe.com");
    return Arrays.asList(user, user2, user3);
  }

}
