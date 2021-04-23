package pl.coderslab.final_project.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.final_project.patient.Patient;
import pl.coderslab.final_project.patient.PatientDto;
import pl.coderslab.final_project.patient.PatientService;
import pl.coderslab.final_project.security.CurrentUser;
import pl.coderslab.final_project.security.User;
import pl.coderslab.final_project.security.UserService;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
        PatientDto patientByUserDto = patientService.findPatientByUser(userName).orElseThrow(() -> {
            throw new UsernameNotFoundException(userName);
        });
        model.addAttribute("user", byUserName);
        model.addAttribute("patient", patientByUserDto);
        return "patientdata";
    }

    @GetMapping("/updatedata")
    public String updatePatientData(@AuthenticationPrincipal CurrentUser customUser, Model model) {
        String userName = customUser.getUsername();
        PatientDto patientDto = patientService.findPatientByUser(userName).orElseThrow(() -> {
            throw new UsernameNotFoundException(userName);
        });

        model.addAttribute("patient", patientDto);
        return "patientdataform";
    }

    @PostMapping("/updatedata")
    public String updatePatientDataForm(@Valid PatientDto patientDto, BindingResult bindingResult, Model model) {
//        Optional<Patient> patientByEmail = patientService.findPatientByEmail(patient.getEmail());
//        patientByEmail.ifPresent(x -> {
//            bindingResult.rejectValue("email", "error.email",
//                    "Email o podanej nazwie już istnieje");
//        });

        if (bindingResult.hasErrors()) {
            return "patientdataform";
        }
        patientService.updatePatient(patientDto);
        model.addAttribute("patient", patientDto);

        return "redirect:/patient/showdata";
    }

}
