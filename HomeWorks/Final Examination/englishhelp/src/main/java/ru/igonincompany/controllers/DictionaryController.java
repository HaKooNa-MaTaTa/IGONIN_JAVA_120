package ru.igonincompany.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.igonincompany.security.details.UserDetailsImpl;
import ru.igonincompany.security.details.UserDetailsServiceImpl;
import ru.igonincompany.services.UsersServiceImpl;
import ru.igonincompany.utils.UserAuthenticationUtil;

@Controller
public class DictionaryController {

    @Autowired
    private UserAuthenticationUtil authenticationUtil;

    @GetMapping(value = "/dictionary")
    public String getDictionaryPage(@AuthenticationPrincipal UserDetailsImpl user, Model model) {
        model.addAttribute("user", authenticationUtil.getUserByUserDetails(user));
        return "dictionary";
    }
}
