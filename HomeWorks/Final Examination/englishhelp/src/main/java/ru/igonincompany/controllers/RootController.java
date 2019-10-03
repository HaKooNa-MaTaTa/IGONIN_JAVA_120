package ru.igonincompany.controllers;


import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RootController {

    @GetMapping(value = "/")
    public String getRootPage(Authentication authentication) {
        if (authentication != null) {
            return "redirect:/profile";
        } else {
            return "redirect:/signIn";
        }
    }
}
