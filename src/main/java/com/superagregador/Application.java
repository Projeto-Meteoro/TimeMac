package com.superagregador;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

@SpringBootApplication (scanBasePackages = { "com.superagregador"})
@Controller
public class Application {
    
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}