package pl.coderslab.final_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.coderslab.final_project.security.User;
import pl.coderslab.final_project.security.UserService;

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/create-user")
    @ResponseBody
    public String createUser() {
        User user = new User();
        user.setUserName("admin");
        user.setPassword("adminadmin");
        user.setEmail("admin@admin.pl");
        user.setName("admin");
        user.setLastName("admin");
        userService.saveUser(user);
        return "admin";
    }


}
