package com.wenbronk.profile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class App {
	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
		String[] activeProfiles = context.getEnvironment().getActiveProfiles();  
	    for (String profile : activeProfiles) {  
	        System.out.println("Spring Boot 使用profile为:" + profile);  
	    }  
	}
}
