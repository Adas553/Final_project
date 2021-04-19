package pl.coderslab.final_project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
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

    public PatientHomeController(UserService userServiceImpl) {
        this.userService = userServiceImpl;
    }

    @GetMapping("/home")
    public String showPatientHome(@AuthenticationPrincipal CurrentUser customUser, Model model) {
        String userName = customUser.getUsername();
        User byUserName = userService.findByUserName(userName).orElseThrow(() -> {
            throw new UsernameNotFoundException(userName);
        });
        model.addAttribute("userName", userName);
        return "patienthome";
    }

    @GetMapping("/showdata")
    public String showPatientData(@AuthenticationPrincipal CurrentUser customUser, Model model) {
        String userName = customUser.getUsername();
        User byUserName = userService.findByUserName(userName).orElseThrow(() -> {
            throw new UsernameNotFoundException(userName);
        });;
        model.addAttribute("user", byUserName);
        return "patientdata";
    }

    @GetMapping("/updatedata")
    public String updatePatientData(@AuthenticationPrincipal CurrentUser customUser, Model model) {
        String userName = customUser.getUsername();
        User byUserName = userService.findByUserName(userName).orElseThrow(() -> {
            throw new UsernameNotFoundException(userName);
        });
        model.addAttribute("user", byUserName);
        return "patientdata";
    }

}
