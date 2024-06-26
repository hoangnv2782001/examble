package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	/**
	 * vi dụ beanlicycle
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext app = (ApplicationContext) SpringApplication.run(DemoApplication.class, args);

		Dog animal = app.getBean(Dog.class);

		animal.sua();
	}

}
