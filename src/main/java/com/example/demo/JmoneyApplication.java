package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@SpringBootApplication
public class JmoneyApplication implements CommandLineRunner {

	
	@Autowired
	
	private BCryptPasswordEncoder passEncoder;
	
	
	public static void main(String[] args) {
		SpringApplication.run(JmoneyApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception 
	{
		
		String pass1 = "user";
		String pass2 = "admin";
		
		System.out.println(passEncoder.encode(pass1));
		System.out.println(passEncoder.encode(pass2));

		
	}
	
}
