package ru.igonincompany.services;

import ru.igonincompany.forms.SignUpForm;

public interface UserService {
    void emailConfirm(String email);

    boolean isNotValidUUID(String uuid);

    void signUp(String uuid, SignUpForm form);
}
