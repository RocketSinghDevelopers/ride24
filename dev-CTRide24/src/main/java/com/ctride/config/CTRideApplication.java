package com.ctride.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.ctride.*")
public class CTRideApplication {
	public static void main(String[] args) {
		SpringApplication.run(CTRideApplication.class, args);
	}
}
