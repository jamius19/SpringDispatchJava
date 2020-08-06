package com.jamiussiam.SpringDispatchJava.beta.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{};
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{SpringServletConfig.class};
    }

    protected String[] getServletMappings() {
        return new String[]{"/beta/*"};
    }

    @Override
    protected String getServletName() {
        return "DispatcherB";
    }
}
