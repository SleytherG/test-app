package com.sleyther.curso.springboot.web.models;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

  private String name;
  private String lastname;
  private String email;

  public User(String name, String lastname) {
    this.name = name;
    this.lastname = lastname;
  }


}
