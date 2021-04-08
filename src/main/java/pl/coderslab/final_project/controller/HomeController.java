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

}
