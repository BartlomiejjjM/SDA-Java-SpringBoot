package com.kchmielewski.sda.java.springboot.security.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @GetMapping("login")
    public String login(@RequestParam(required = false) String error, @RequestParam(required = false) String logout,
                        Model model) {
        if (error != null) {
            model.addAttribute("message", "Please provide valid credentials");
        } else if (logout != null) {
            model.addAttribute("message", "Successfully logged out");
        }

        return "login";
    }
}
