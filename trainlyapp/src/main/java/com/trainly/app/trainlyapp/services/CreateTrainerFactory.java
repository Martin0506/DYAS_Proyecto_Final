package com.trainly.app.trainlyapp.services;

public class CreateTrainerFactory implements CreateProfile{
    @Override
    public User createProfile(String type) {
        if (type.equalsIgnoreCase("trainer")) {
            return new TrainerFactory();
        }
        return null;
    }
}
