package com.trainly.app.trainlyapp.controllers;

import com.trainly.app.trainlyapp.services.Login;

public class LoginController {
    private final Login login;

    public LoginController(Login login) {
        this.login = login;
    }

    public String login(String username, String password) {
        if (login.loginUser(username, password)) {
            return "Login successful";
        } else {
            return "Invalid username or password";
        }
    }
}
