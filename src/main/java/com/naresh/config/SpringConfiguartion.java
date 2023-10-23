package com.naresh.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringConfiguartion extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {MVCConfiguration.class} ;
	}

	@Override
	protected String[] getServletMappings() {
		String[] allowedURLMapping = {"/"};
		return allowedURLMapping;
}
}