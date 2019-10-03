package ru.igonincompany.utils;

import org.springframework.stereotype.Component;
import ru.igonincompany.dto.UserDto;
import ru.igonincompany.models.User;
import ru.igonincompany.security.details.UserDetailsImpl;

import static ru.igonincompany.dto.UserDto.from;

@Component
public class UserAuthenticationUtil {
    public UserDto getUserByUserDetails(UserDetailsImpl userDetails) {
        User user = userDetails.getUser();
        return from(user);
    }
}
