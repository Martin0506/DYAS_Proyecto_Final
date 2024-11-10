package com.trainly.app.trainlyapp.services;

import com.trainly.app.trainlyapp.DAO.UserDAO;
import com.trainly.app.trainlyapp.services.User;

public class CreateUser {
    private UserDAO userDAO = new UserDAO();

    public boolean registerUser(String username, String password, String email, String userType) {
        User user = new User(username, password, email, userType);
        return userDAO.registerUser(user);
    }
}



