package ru.igonincompany.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import ru.igonincompany.forms.SignUpForm;
import ru.igonincompany.models.User;
import ru.igonincompany.models.enums.UserRole;
import ru.igonincompany.models.enums.UserState;
import ru.igonincompany.repositories.UsersRepository;

import javax.jws.soap.SOAPBinding;
import java.util.concurrent.ExecutorService;


@Component
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private ExecutorService executorService;

    @Transactional
    @Override
    public void signUp(String uuid, SignUpForm form) {
        User user = usersRepository.findByConfirmUUID(uuid);
        user.setHashPassword(passwordEncoder.encode(form.getPassword()));
        user.setLogin(form.getLogin());
        user.setRole(UserRole.USER);
        user.setFirstName(form.getFirstName());
        user.setLastName(form.getLastName());
        user.setState(UserState.CONFIRMED);
        user.setConfirmUUID(null);

        usersRepository.save(user);
    }

    @Override
    public void emailConfirm(String email) {

    }

    @Override
    public boolean isNotValidUUID(String uuid) {
        return !usersRepository.existsByConfirmUUID(uuid);
    }
}
