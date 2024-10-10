package ru.sysout.sec2.repository;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import ru.sysout.sec2.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
