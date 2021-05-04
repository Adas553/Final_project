package pl.coderslab.final_project.security;

import java.util.Optional;

public interface UserService {
    Optional<User> findByUserName(String name);
    User findByEmail(String email);
    void saveUser(User user);
}
