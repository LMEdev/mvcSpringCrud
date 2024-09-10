package ru.leonid.springMVCHiberCrud.configs;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DispatcherInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {SpringMVCConfig.class}; //указываем конфигурацию сервлета
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"}; //указываем то, что все запросы начиная с корня (/) будут приходить в наш сервлет
    }

}
