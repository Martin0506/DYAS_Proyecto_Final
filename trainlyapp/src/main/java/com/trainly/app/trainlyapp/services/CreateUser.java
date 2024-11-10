package com.trainly.app.trainlyapp.services;

import com.trainly.app.trainlyapp.DAO.UserDAO;

public class CreateUser {
    private UserDAO userDAO = new UserDAO();

    public boolean registerUser(String username, String password, String email, String userType) {
        CreateProfile factory;

        if (userType.equalsIgnoreCase("client")) {
            factory = new CreateClientFactory();
        } else if (userType.equalsIgnoreCase("trainer")) {
            factory = new CreateTrainerFactory();
        } else {
            throw new IllegalArgumentException("Tipo de usuario no válido");
        }

        User user = factory.createProfile(userType);
        user.setUsername(username);
        user.setPassword(password);
        user.setEmail(email);

        return userDAO.registerUser(user);
    }
}