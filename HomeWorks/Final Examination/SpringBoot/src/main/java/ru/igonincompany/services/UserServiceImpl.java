package ru.igonincompany.services;

import ru.igonincompany.forms.SignUpForm;

public class UserServiceImpl implements UserService {
    @Override
    public void emailConfirm(String email) {

    }

    @Override
    public boolean isNotValidUUID(String uuid) {
        return false;
    }

    @Override
    public void signUp(String uuid, SignUpForm form) {

    }
}
