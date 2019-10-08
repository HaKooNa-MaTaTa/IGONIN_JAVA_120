package ru.igonincompany.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.igonincompany.security.details.UserDetailsImpl;
import ru.igonincompany.utils.UserAuthenticationUtil;

@Controller
public class MenuController {

    @Autowired
    private UserAuthenticationUtil user;

    @GetMapping(value = "/menu")
    public String getMenuPage(@AuthenticationPrincipal UserDetailsImpl userDetails, Model model) {
        model.addAttribute("user", user.getUserByUserDetails(userDetails));
        return "menu";
    }
}
