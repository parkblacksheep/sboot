package com.kosta.ourapp;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OurappApplication {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(OurappApplication.class);
//		application.setWebApplicationType(WebApplicationType.SERVLET);
//		application.setBannerMode(Banner.Mode.OFF);
		application.run(args);
	}

}
