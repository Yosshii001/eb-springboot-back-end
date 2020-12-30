package com.jyoshita.sample.ecsspringbootbackend.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jyoshita.sample.ecsspringbootbackend.model.User;

@RestController
@RequestMapping("/api/v1")
public class BackendRestController {
  @GetMapping("/users")
  public List<User> getUsers(){
      List<User> users = new ArrayList<>();
      users.add(User.builder().userId("1").userName("Taro").build());
      users.add(User.builder().userId("2").userName("Jiro").build());
      return users;
  }
}
