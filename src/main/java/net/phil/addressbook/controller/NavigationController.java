package net.phil.addressbook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavigationController {

  @GetMapping("/get-profile")
  public String getProfile() {
    return "page-profile";
  }

  @GetMapping("/get-register")
  public String getRegister() {
    return "page-register";
  }

  @GetMapping("/get-login")
  public String getLogin() {
    return "page-login";
  }

  @GetMapping("/get-index")
  public String getIndex() {
    return "page-index";
  }

}
