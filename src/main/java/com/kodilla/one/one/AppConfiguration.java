package com.kodilla.one.one;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
class AppConfiguration {

    @Bean
    @Scope("prototype")
    public LibraryManager libraryManager() {
        return new LibraryManager();
    }

    @Bean
    public BeanMonitor beanMonitor() {
        return new BeanMonitor();
    }


}