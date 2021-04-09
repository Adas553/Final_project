package pl.coderslab.final_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String showHome() {
        return "home";
    }

    @GetMapping("/about")
    public String showUs() {
        return "about";
    }

    @GetMapping("/statute")
    public String showStatute() {
        return "statute";
    }

    @GetMapping("/contact")
    public String showContact() {
        return "contact";
    }

    @GetMapping("/specialists")
    public String showSpecialists() {
        return "specialists";
    }

}
