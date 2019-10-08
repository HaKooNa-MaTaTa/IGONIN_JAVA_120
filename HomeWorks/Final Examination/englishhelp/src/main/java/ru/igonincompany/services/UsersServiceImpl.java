package ru.igonincompany.services;

import freemarker.template.Template;
import lombok.SneakyThrows;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import ru.igonincompany.forms.SignUpForm;
import ru.igonincompany.models.User;
import ru.igonincompany.models.enums.UserRole;
import ru.igonincompany.models.enums.UserState;
import ru.igonincompany.repositories.UsersRepository;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.ExecutorService;


@Component
public class UsersServiceImpl implements UsersService {

    private Logger logger = LoggerFactory.getLogger(UsersServiceImpl.class);
    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private EmailService emailService;

    @Value("${mail.confirm.subject}")
    private String subject;

    @Autowired
    private Template confirmMailTemplate;

    @Value("${server.url}")
    private String serverUrl;

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
        //user.setConfirmUUID(null);

        usersRepository.save(user);
    }
    @SneakyThrows
    @Override
    public void emailConfirm(String email) {
        Optional<User> user = usersRepository.findByEmail(email);
        User newUser = user.orElseGet(() -> User.builder()
            .email(email)
                .build());

        newUser.setState(UserState.NOT_CONFIRMED);
        newUser.setConfirmUUID(UUID.randomUUID().toString());

        usersRepository.save(newUser);

        Runnable confirmMailTask = () -> {
            Map<String, Object> placeHolders = new HashMap<>();
            placeHolders.put("host", serverUrl);
            placeHolders.put("id", newUser.getConfirmUUID());

            StringWriter stringWriter = new StringWriter();
            try {
                confirmMailTemplate.process(placeHolders, stringWriter);
            } catch (Exception e) {
                throw new IllegalArgumentException(e);
            }
            String mailText = stringWriter.toString();

            logger.info("Send email to " + newUser.getEmail() + " by thread " + Thread.currentThread().getName());
            emailService.sendEmail(newUser.getEmail(), subject, mailText);
        };

        executorService.submit(confirmMailTask);
    }

    @Override
    public boolean isNotValidUUID(String uuid) {
        return !usersRepository.existsByConfirmUUID(uuid);
    }
}
