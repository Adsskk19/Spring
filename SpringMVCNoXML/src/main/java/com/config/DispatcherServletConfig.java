package com.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DispatcherServletConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override //Servlet - information class it is Config.class
	protected Class<?>[] getServletConfigClasses() {
		Class[] configClasses = { Config.class };
		return configClasses;
	}

	@Override //url pattern or mapping
	protected String[] getServletMappings() {
		String[] mappings = {"/flm/*"};
		return mappings;
	}
	
	
	
}
