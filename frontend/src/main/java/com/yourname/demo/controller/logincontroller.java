package com.yourname.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    @PostMapping("/login")
    public String loginUser(@RequestParam String username,
                            @RequestParam String password,
                            Model model) {
        // Hardcoded credentials
        if ("admin".equals(username) && "password123".equals(password)) {
            model.addAttribute("username", username);
            return "success";
        } else {
            model.addAttribute("error", "Invalid username or password");
            return "login";
        }
    }
}