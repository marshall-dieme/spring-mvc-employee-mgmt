package com.saraya.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    public void configureGlobalSecurity(AuthenticationManagerBuilder auth)
            throws Exception {
        //In this method we will specify the login credentials and the user roles
        auth.inMemoryAuthentication().withUser("marshall").password("{noop}secret")
                .roles("USER", "ADMIN");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //In this method we will restrict the visibility of our urls
        http.authorizeRequests().antMatchers("/login").permitAll()
                .antMatchers("/**")
                .access("hasRole('USER')")
                .and().formLogin();
    }
}
