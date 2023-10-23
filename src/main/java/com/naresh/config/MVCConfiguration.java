package com.naresh.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
	@ComponentScan("com.*")
	@EnableWebMvc
	public class MVCConfiguration extends WebMvcConfigurationSupport {
		
		
		@Bean
			InternalResourceViewResolver getViewResolver() {//that support internal Resource view i.e(Servlet&Jsp)
			InternalResourceViewResolver viewResolver= new InternalResourceViewResolver();
			
			//In which PAth Folder 
			viewResolver.setPrefix("/WEB-INF/views/");
			viewResolver.setSuffix(".jsp");
			
			return viewResolver;
			
		}


}