package pl.coderslab.final_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import pl.coderslab.final_project.model.User;
import pl.coderslab.final_project.security.UserService;

import javax.validation.Valid;

@Controller
public class LoginController {

    private final UserService userService;


    public LoginController(UserService userServiceImpl) {
        this.userService = userServiceImpl;
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
        User newUser = userService.findByUserName(user.getUserName());
        if (newUser != null) {
            bindingResult
                    .rejectValue("userName", "error.user",
                            "Użytkownik o podanej nazwie już istnieje");
        }
        if (bindingResult.hasErrors()) {
            return "registration";
        }
        userService.saveUser(user);
        model.addAttribute("successMessage", "Użytkownik został poprawnie zarejestrowany");
        model.addAttribute("user", new User());
        return "registration";

    }
}