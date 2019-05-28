package com.prashant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class BootJpaH2Application {

	public static void main(String[] args) {
		SpringApplication.run(BootJpaH2Application.class, args);
	}
}
