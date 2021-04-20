package pl.coderslab.final_project.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.final_project.patient.Patient;
import pl.coderslab.final_project.patient.PatientService;
import pl.coderslab.final_project.security.CurrentUser;
import pl.coderslab.final_project.security.User;
import pl.coderslab.final_project.security.UserService;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/patient")
public class PatientHomeController {

    private final UserService userService;
    private final PatientService patientService;

    public PatientHomeController(UserService userServiceImpl, PatientService patientServiceImpl) {
        this.userService = userServiceImpl;
        this.patientService = patientServiceImpl;
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
        Patient patient = patientService.findPatientByUser(userName).orElseGet(() -> new Patient(userName));
        String email = patient.getUser().getEmail();
        model.addAttribute("user", byUserName);
        model.addAttribute("patient", patient);
        model.addAttribute("email", email);
        return "patientdataform";
    }

    @ModelAttribute("gender")
    public List<String> gender() {
        return new ArrayList<>(List.of("M", "K"));
    }

}
