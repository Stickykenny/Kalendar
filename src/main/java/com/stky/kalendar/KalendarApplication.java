package com.stky.kalendar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KalendarApplication {

	public static void main(String[] args) {
		SpringApplication.run(KalendarApplication.class, args);
		System.out.println("http://localhost:8081/welcome");
		System.out.println("http://localhost:8081/person/welcome");
		System.out.println("http://localhost:8081/person/1");

	}

}
