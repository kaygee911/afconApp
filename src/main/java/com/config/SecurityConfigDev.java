package com.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;

@Configuration
@EnableWebSecurity
@Profile("dev")
public class SecurityConfigDev {
	
	// Disable security for development profile
    @SuppressWarnings("deprecation")
	protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
            .requestMatchers("/**").permitAll()
            .and().csrf().disable(); // Disable CSRF for simplicity in a development environment
        
    }
}
