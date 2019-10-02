package ru.igonincompany.models;

import lombok.*;
import ru.igonincompany.models.enums.UserRole;
import ru.igonincompany.models.enums.UserState;

import javax.persistence.*;

@Builder
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="service_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name", length = 20)
    private String firstName;

    @Column(name = "last_name", length = 20)
    private String lastName;

    private String phone;
    private Integer age;
    private String email;
    private String login;
    private String hashPassword;

    @Enumerated(value = EnumType.STRING)
    private UserRole role;

    @Enumerated(value = EnumType.STRING)
    private UserState state;

    private String confirmUUID;
}
