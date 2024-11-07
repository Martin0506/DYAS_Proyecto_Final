package com.trainly.app.trainlyapp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.trainly.app.trainlyapp.controllers.UserController;


import com.trainly.app.trainlyapp.controllers.UserController;

@SpringBootTest
class TrainlyappApplicationTests {

	@Test
	void contextLoads() {
	}

	public static void main(String[] args) {
        UserController userController = new UserController();
        String result = userController.registerUser("martin1", "12345", "correo@ejemplo.com","client");
        System.out.println(result);
    }
}
