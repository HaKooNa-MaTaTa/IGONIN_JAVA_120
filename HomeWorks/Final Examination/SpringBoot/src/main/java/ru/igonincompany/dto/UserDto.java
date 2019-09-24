package ru.igonincompany.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.igonincompany.models.User;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {
    private String firstName;
    private String lastName;
    private Long id;
    private String role;

    public boolean isAdmin(String role) {
        return role.equals("ADMIN");
    }

    public static UserDto from(User model) {
        return UserDto.builder()
                .firstName(model.getFirstName())
                .lastName(model.getLastName())
                .id(model.getId())
                .role(model.getRole().toString())
                .build();
    }

}
