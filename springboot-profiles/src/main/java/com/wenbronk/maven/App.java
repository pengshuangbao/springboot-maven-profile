package com.wenbronk.maven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class App extends SpringBootServletInitializer {

	/**
	 * war使用
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(App.class);
	}

	/**
	 * jar使用
	 * @param args
	 * @throws Exception
	 * @time 2017年5月15日
	 */
	public static void main(String[] args) throws Exception {
		SpringApplication.run(App.class, args);
	}

}
