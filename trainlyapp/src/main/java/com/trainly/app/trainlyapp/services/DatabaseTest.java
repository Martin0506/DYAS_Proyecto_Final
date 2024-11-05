package com.trainly.app.trainlyapp.services;

import java.sql.Connection;
import java.sql.SQLException;

import com.trainly.app.trainlyapp.config.DatabaseConfig;

public class DatabaseTest {
    public static void main(String[] args) {
        try (Connection connection = DatabaseConfig.getConnection()) {
            if (connection != null) {
                System.out.println("Conexión exitosa a la base de datos.");
            }
        } catch (SQLException e) {
            System.out.println("Error de conexión: " + e.getMessage());
        }
    }
}



