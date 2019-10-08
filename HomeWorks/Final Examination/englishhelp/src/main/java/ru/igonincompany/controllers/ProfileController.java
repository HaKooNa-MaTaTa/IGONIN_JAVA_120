package ru.igonincompany.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.igonincompany.security.details.UserDetailsImpl;
import ru.igonincompany.utils.UserAuthenticationUtil;

@Controller
public class ProfileController {

    @Autowired
    private UserAuthenticationUtil authenticationUtil;

    @GetMapping(value = "/profile")
    public String getProfilePage(@AuthenticationPrincipal UserDetailsImpl userDetails, Model model) {
        model.addAttribute("user", authenticationUtil.getUserByUserDetails(userDetails));
        return "profile";
    }
}
