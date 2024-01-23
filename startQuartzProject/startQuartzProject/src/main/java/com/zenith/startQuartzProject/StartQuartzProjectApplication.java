package com.zenith.startQuartzProject;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.zenith.exampleservice.service.Aservice;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(scanBasePackages = "com.zenith")
@EnableScheduling
public class StartQuartzProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(StartQuartzProjectApplication.class, args);
	}

}
