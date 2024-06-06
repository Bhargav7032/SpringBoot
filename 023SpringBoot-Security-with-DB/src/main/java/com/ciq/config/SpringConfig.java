package com.ciq.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class SpringConfig {

	@Autowired
	private UserDetailsService userDetailsService;
	
	
	@Bean
	public AuthenticationManager authenticationManager(AuthenticationConfiguration configuration) throws Exception {
		return configuration.getAuthenticationManager();
	}

	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}

//	@Bean
//	public UserDetailsService userDetailsService() {
//		UserDetails ciq = User.builder().username("ciq").password("$2a$10$D3fXtWyVIMA.f.MJlH0FAuX/TP0y.jwg.mpH/tN1Ue1pY6AD57Zdm").roles("USER").build();
//		UserDetails vidvaan = User.builder().username("vidvaan").password("$2a$10$N6dXR3guEPUnT7y8s6X5KOj12RPCNiH7/c./llzFT8G8/7JdeXlJm").roles("USER").build();
//		UserDetails admin = User.builder().username("admin").password("$2a$10$Ebwe8khlW3rBmDBV87uFAuFyii/GMWblK8JgC/A4./NCMC0Z/f8SS").roles("ADMIN").build();
//
//		return new InMemoryUserDetailsManager(ciq, vidvaan, admin);
//	}

}
