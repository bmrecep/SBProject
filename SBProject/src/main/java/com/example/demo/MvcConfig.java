package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer  {

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		// TODO Auto-generated method stub
		// WebMvcConfigurer.super.addViewControllers(registry);
		registry.addViewController("/recep").setViewName("home/index");
		registry.addViewController("/hello").setViewName("home/hello");
	}
}
