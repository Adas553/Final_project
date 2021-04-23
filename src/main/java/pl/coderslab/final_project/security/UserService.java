package pl.coderslab.final_project.security;

import pl.coderslab.final_project.model.User;

import java.util.Optional;

public interface UserService {
    Optional<User> findByUserName(String name);
    User findByEmail(String email);
    void saveUser(User user);
}
