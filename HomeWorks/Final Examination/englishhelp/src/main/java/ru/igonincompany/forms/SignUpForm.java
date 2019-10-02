package ru.igonincompany.forms;


import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class SignUpForm {
    private String firstName;
    private String lastName;

    private String login;
    private String password;
}
