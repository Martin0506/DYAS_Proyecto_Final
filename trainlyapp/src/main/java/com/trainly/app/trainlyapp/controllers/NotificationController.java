package com.trainly.app.trainlyapp.controllers;

// ControladorNotificaciones.java
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
public class NotificationController {
    
    @GetMapping("/api/notifications")
    public List<Notification> sendNotifications() {
        List<Notification> notifications = new ArrayList<>();
        
        // Sample notifications; replace with actual logic to fetch notifications
        notifications.add(new Notification("Nueva sesión de ejercicio disponible"));
        notifications.add(new Notification("¡Buen trabajo! Has completado tu objetivo diario"));
        
        return notifications;
    }
}

// Simple Notificacion class to hold the notification message
class Notification {
    private String message;

    public Notification(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}