package com.trainly.app.trainlyapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {
    @GetMapping("/")
    public String index() {
        return "index"; // Devuelve index.html
    }

    @GetMapping("/login")
    public String login() {
        return "auth/Login"; // Devuelve auth/Login.html
    }

    @GetMapping("/register")
    public String register() {
        return "auth/Register"; // Devuelve auth/Register.html
    }
}