package com.hanif.portofolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
		System.out.println(Message());
	}

	public static String Message() {
		return "Service Authentication is Running";
	}
}
