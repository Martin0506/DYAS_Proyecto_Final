package com.trainly.app.trainlyapp.services;

import com.trainly.app.trainlyapp.DAO.UserDAO;

public class Login {
    private final UserDAO userDAO;

    public Login(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public boolean loginUser(String username, String password) {
        return userDAO.loginUser(username, password);
    }
}




