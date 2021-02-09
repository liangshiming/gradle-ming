package com.ming.web;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.ming")
@SpringBootApplication
public class GradleMingWebApplication {
	public static void main(String[] args) {
		SpringApplication.run(GradleMingWebApplication.class, args);
	}
}
