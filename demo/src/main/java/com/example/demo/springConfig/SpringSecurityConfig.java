package com.example.demo.springConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

//configuration annnotation is a class level annotation, its tell IOC container to create bean as per this class source
//Indicates that a class declares one or more @Bean methods and may be processed by the Spring container to generate bean definitions 
@Configuration
public class SpringSecurityConfig {
	
	@Bean
	 public static PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

	
//	@Bean
//    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//
//        http.csrf().disable()
//                .authorizeHttpRequests((authorize) -> {
//                    authorize.anyRequest().authenticated();
//                }).httpBasic(Customizer.withDefaults());
//        return http.build();
//    }
	
	@Bean
    public UserDetailsService userDetailsService(){

        UserDetails ramesh = User.builder()
                .username("Ratan")
                .password(passwordEncoder().encode("password"))
                .roles("USER")
                .build();

        UserDetails admin = User.builder()
                .username("admin")
                .password(passwordEncoder().encode("adminpass"))
                .roles("ADMIN")
                .build();

        return new InMemoryUserDetailsManager(ramesh, admin);
    }

}
