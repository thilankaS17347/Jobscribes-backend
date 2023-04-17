package com.example.JobTrialPortal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = { "com.example","com.example.JobTrialPortal.service","com.example.JobTrialPortal","com.example.JobTrialPortal.controller" })
@ComponentScan({ "com.example","com.example.JobTrialPortal.service","com.example.JobTrialPortal" })
public class JobTrialPortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobTrialPortalApplication.class, args);
	}

}
