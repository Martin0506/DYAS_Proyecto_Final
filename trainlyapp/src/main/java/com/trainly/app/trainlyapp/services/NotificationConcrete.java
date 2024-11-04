package com.trainly.app.trainlyapp.services;

public class NotificationConcrete extends Notification{
    private String observerState;

    public NotificationConcrete(String notificationType) {
        super(notificationType);
    }

    public String getState() {
        return observerState;
    }

    public void setState(String state) {
        this.observerState = state;
        notificar();
    }

    @Override
    public void notificar() {
        // Logic to notify observers
        System.out.println("Notificación: " + notificationType + " - Estado: " + observerState);
    }
}
