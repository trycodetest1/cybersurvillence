package com.hackathon.cyber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @LoggingServiceConsumer Used to Initialize the application
 */

@SpringBootApplication

public class CyberApplication {

	/**
	 * Initialize the spring application
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(CyberApplication.class, args);
	}

}
