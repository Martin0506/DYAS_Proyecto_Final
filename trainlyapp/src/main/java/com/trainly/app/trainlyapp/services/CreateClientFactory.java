package com.trainly.app.trainlyapp.services;

public class CreateClientFactory implements CreateProfile{
    @Override
    public User createProfile(String type) {
        if (type.equalsIgnoreCase("client")) {
            return new ClientFactory();
        }
        return null;
    }
}
