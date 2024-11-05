package com.trainly.app.trainlyapp.services;

public abstract class Notification {
    protected String notificationType;

    public Notification(String notificationType) {
        this.notificationType = notificationType;
    }

    public abstract void notificar();
}
