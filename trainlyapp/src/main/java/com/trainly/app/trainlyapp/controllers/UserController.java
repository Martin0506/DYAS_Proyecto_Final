package com.trainly.app.trainlyapp.controllers;

import com.trainly.app.trainlyapp.services.CreateUser;

public class UserController {
    private CreateUser userService = new CreateUser();

    public String registerUser(String username, String password, String email, String userType) {
        boolean isRegistered = userService.registerUser(username, password, email, userType);
        if (isRegistered) {
            return "Usuario registrado con éxito";
        } else {
            return "Error al registrar el usuario";
        }
    }
}
