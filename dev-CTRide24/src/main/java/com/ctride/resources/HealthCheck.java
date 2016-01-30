package com.ctride.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Health check controller
 *
 */
@RestController
public class HealthCheck {
	@RequestMapping("/health")
	public String healthCheck() {
		return "Service is healthy !!";
	}
}
