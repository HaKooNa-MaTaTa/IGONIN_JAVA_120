package ru.igonincompany.forms;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SignUpForm {
    private String firstName;
    private String lastName;
    private String login;
    private String password;
}
