package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MessageHndelingApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessageHndelingApplication.class, args);

		System.out.println("server running"); 
	}

}
