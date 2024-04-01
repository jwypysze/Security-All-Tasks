package com.kodilla.securitytask;

import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("basic").password("basic").roles("BASIC");
        auth.inMemoryAuthentication().withUser("advanced").password("advanced").roles("ADVANCED");
        auth.inMemoryAuthentication().withUser("admin").password("admin").roles("ADMIN");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();

        http.authorizeRequests()
                .mvcMatchers(HttpMethod.GET, "/person/readAndWrite/**")
                .hasAnyRole("BASIC", "ADVANCED", "ADMIN")


                .mvcMatchers(HttpMethod.GET, "/beanlifecycle/create/**")
                .hasAnyRole("BASIC", "ADVANCED", "ADMIN")


                .mvcMatchers(HttpMethod.POST, "/calculator/**")
                .hasAnyRole("BASIC", "ADVANCED", "ADMIN")


                .mvcMatchers(HttpMethod.GET, "/integration/read/**")
                .hasAnyRole("BASIC", "ADVANCED", "ADMIN")


                .mvcMatchers(HttpMethod.POST, "/dog/add/**")
                .hasAnyRole("ADVANCED", "ADMIN")

                .mvcMatchers(HttpMethod.GET, "/books/**")
                .hasAnyRole("ADVANCED", "ADMIN")


                .mvcMatchers(HttpMethod.POST, "/reflection/create/**")
                .hasAnyRole("ADMIN")


                .mvcMatchers(HttpMethod.GET, "/agent/create/**")
                .hasAnyRole("ADMIN")


                .mvcMatchers(HttpMethod.POST, "/messages/process/**")
                .hasAnyRole("ADMIN")


                .mvcMatchers(HttpMethod.POST, "/integration/create/**")
                .hasAnyRole("ADMIN")


                .anyRequest()
                .fullyAuthenticated()
                .and()
                .httpBasic();
    }

    @Bean
    public static NoOpPasswordEncoder passwordEncoder() {
        return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
    }



}
