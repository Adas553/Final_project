package pl.coderslab.final_project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.final_project.model.CurrentUser;
import pl.coderslab.final_project.model.User;
import pl.coderslab.final_project.security.UserService;

@Controller
@RequestMapping("/patient")
public class PatientHomeController {

    private final UserService userService;

    @Autowired
    public PatientHomeController(UserService userServiceImpl) {
        this.userService = userServiceImpl;
    }

    @GetMapping("/home")
    public String showPatientHome(@AuthenticationPrincipal CurrentUser customUser, Model model) {
        String userName = customUser.getUsername();
        User byUserName = userService.findByUserName(userName);
        model.addAttribute("userName", userName);
        return "patienthome";
    }

}
