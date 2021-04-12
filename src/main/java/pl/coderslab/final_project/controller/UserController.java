//package pl.coderslab.final_project.controller;
//
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//import pl.coderslab.final_project.model.User;
//import pl.coderslab.final_project.service.UserService;
//
//@Controller
//public class UserController {
//
//    private final UserService userService;
//
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }
//
//    @GetMapping("/create-user")
//    @ResponseBody
//    public String createUser() {
//        User user = new User();
//        user.setUserName("ADMIN");
//        user.setPassword("ADMIN");
//        userService.saveUser(user);
//        return "admin";
//    }
//
//
//}
