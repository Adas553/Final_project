package pl.coderslab.final_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import pl.coderslab.final_project.patient.Patient;
import pl.coderslab.final_project.patient.PatientService;
import pl.coderslab.final_project.security.User;
import pl.coderslab.final_project.security.UserService;

import javax.validation.Valid;
import java.util.Optional;

@Controller
public class LoginController {

    private final UserService userService;
    private final PatientService patientService;

    public LoginController(UserService userServiceImpl, PatientService patientServiceImpl) {
        this.userService = userServiceImpl;
        this.patientService = patientServiceImpl;
    }

    @GetMapping("/login")
    public String showLogin() {
        return "login";
    }

    @GetMapping("/registration")
    public String showRegistration(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "registration";
    }

    @PostMapping("/registration")
    public String createNewUser(@Valid User user, BindingResult bindingResult, Model model) {
        Optional<User> newUser = userService.findByUserName(user.getUserName());

        newUser.ifPresent(x -> bindingResult.rejectValue("userName", "error.user",
                "Użytkownik o podanej nazwie już istnieje"));

        if (bindingResult.hasErrors()) {
            return "registration";
        }
        userService.saveUser(user);
        Patient patient = new Patient(user.getUserName());
        patientService.savePatient(patient);
        model.addAttribute("successMessage", "Użytkownik został poprawnie zarejestrowany");
        model.addAttribute("user", new User());
        return "registration";
    }


}