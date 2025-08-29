package org.lessons.java.hello_spring_mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
@RequestMapping("/")

public class HomeController {
    
    @GetMapping("/")

    public String home() {
        return "home";
    }
    
    @GetMapping("/welcome")
    public String greeting(Model model, @RequestParam(name = "name") String name, @RequestParam(name = "surname")String surname) {
        model.addAttribute("name", name);
        model.addAttribute("surname", surname);
        return "greeting";
    }
}
