package ru.igonincompany.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.igonincompany.models.User;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<User, Long> {
    Optional<User> findByLogin(String login);

    boolean existsByConfirmUUID(String uuid);

    User findByConfirmUUID(String uuid);

    Optional<User> findByEmail(String email);
}
