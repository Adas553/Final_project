package pl.coderslab.final_project.service;

import pl.coderslab.final_project.model.User;

public interface UserService {
    User findByUserName(String name);
    User findByEmail(String email);
    void saveUser(User user);
}
