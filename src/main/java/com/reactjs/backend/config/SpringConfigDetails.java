package com.reactjs.backend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
public class SpringConfigDetails {

	//Changes password into hash format
	@Bean
	public PasswordEncoder passwordEncoderData() {
		PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String hashedPassword = passwordEncoder.encode("base");
		System.out.println(hashedPassword );
		
		return new BCryptPasswordEncoder();
	}

	
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity security) throws Exception {
		
		
		//Url which we are using in this we can hit these urls without login into our application
		return security.csrf(csrf -> csrf.disable())
				.authorizeHttpRequests(auth -> auth
						 .requestMatchers("/user-list","/userhome","/register/view/**","/register","/home","/register-old","/saveemployee","/assets/**","/test/**").permitAll().anyRequest().authenticated())
				
				
				.formLogin(login -> login.loginPage("/login").loginProcessingUrl("/login").defaultSuccessUrl("/home")
						.permitAll())
				.logout(logout -> logout.logoutRequestMatcher(new AntPathRequestMatcher("/logout")).permitAll())
				.build();
		
	}

	//We can use these functionality of authentication by using this method
	@Bean
	public AuthenticationManager authenticationManager(AuthenticationConfiguration configuration) throws Exception {
		return configuration.getAuthenticationManager();
	}

}
