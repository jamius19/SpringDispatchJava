package com.jamiussiam.SpringDispatchJava.alpha.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{};
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{SpringServletConfig.class};
    }

    protected String[] getServletMappings() {
        return new String[]{"/alpha/*"};
    }

    @Override
    protected String getServletName() {
        return "DispatcherA";
    }
}
