package com.naveen.springprofileenv;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringProfileEnvApplication implements CommandLineRunner {

	@Value("${spring.profiles.active}")
	private String active;
	@Value("${spring.application.name}")
	private String applicationName;

	public static void main(String[] args) {
		SpringApplication.run(SpringProfileEnvApplication.class, args);
	}


	@Override
	public void run(String... args) {
		System.out.println("Active profile: " + active);
		System.out.println("Application name: " + applicationName);
	}
}
