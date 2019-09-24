package ru.igonincompany.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.igonincompany.forms.SignUpForm;
import ru.igonincompany.services.UserService;

@Controller
public class SignUpController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/email/confirm")
    public String emailConfirm(@RequestParam("email") String email) {
        userService.emailConfirm(email);
        return "afterEmailConfirm";
    }

    @GetMapping(value = "/email/confirm")
    public String getEmailConfirmPage() {
        return "emailConfirm";
    }

    @GetMapping(value = "/signUp")
    public String signUp(SignUpForm form, @RequestParam(value = "id", required = false) String uuid) {
        if (uuid == null || uuid.equals("") || userService.isNotValidUUID(uuid)) {
            return "redirect:/signIn";
        }

        userService.signUp(uuid, form);
        return "redirect:/signIn";
    }
}
