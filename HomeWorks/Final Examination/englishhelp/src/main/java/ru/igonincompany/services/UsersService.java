package ru.igonincompany.services;


import ru.igonincompany.forms.SignUpForm;

public interface UsersService {
    void signUp(String uuid, SignUpForm form);
    void emailConfirm(String email);
    boolean isNotValidUUID(String uuid);
}
