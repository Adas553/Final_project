package pl.coderslab.final_project.controller;

import org.springframework.stereotype.Controller;
import pl.coderslab.final_project.service.UserService;

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


}
