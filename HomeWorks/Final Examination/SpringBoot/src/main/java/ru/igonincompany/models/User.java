package ru.igonincompany.models;

import lombok.*;

import javax.persistence.*;

@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "service_user")
public class User {

    @Column(name = "first_name", length = 30)
    private String firstName;

    @Column(name = "last_name", length = 30)
    private String lastName;

    private Integer age;
    private String phone;
    private String email;
    private String login;
    private String hashPassword;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(value = EnumType.STRING)
    private UserRole role;
    private String confirmUUID;

    @Enumerated(value = EnumType.STRING)
    private UserState state;
}
