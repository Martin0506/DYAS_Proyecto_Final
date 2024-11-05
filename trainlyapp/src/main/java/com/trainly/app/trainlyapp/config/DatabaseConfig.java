package com.trainly.app.trainlyapp.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.io.InputStream;

public class DatabaseConfig {
    private static Connection connection = null;

    public static Connection getConnection() throws SQLException {
        if (connection == null) {
            try (InputStream input = DatabaseConfig.class.getClassLoader().getResourceAsStream("application.properties")) {
                Properties prop = new Properties();
                prop.load(input);

                String url = prop.getProperty("db.url");
                String username = prop.getProperty("db.username");
                String password = prop.getProperty("db.password");

                connection = DriverManager.getConnection(url, username, password);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
}

