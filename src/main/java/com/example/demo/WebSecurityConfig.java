package com.example.demo;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;



@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private BCryptPasswordEncoder passEncoder;
	
	@Autowired
	public void configurerSecurityGlobal(AuthenticationManagerBuilder builder) 
	{
		try {
			builder.jdbcAuthentication()
			.dataSource(dataSource)
			.passwordEncoder(passEncoder)
			.usersByUsernameQuery("SELECT `username`, `password`, `enabled` FROM `user` WHERE username = ?")
			.authoritiesByUsernameQuery("SELECT u.username, r.rol FROM roles r INNER JOIN user u on r.user_id=u.id WHERE u.username=?");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	


	
}
