package com.stackroute.second;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class InitializerWeb extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{Myconfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}