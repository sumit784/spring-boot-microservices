package com.springboot.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

import net.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy.NoOp;

@Configuration
@EnableWebSecurity
public class AppSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private RestAuthenticationEntryPoint restAuthenticationEntryPoint;
	
	@Autowired
	private UserDetailsService userDetailsService;
	
	
	@Bean
	public AuthenticationProvider authProvider() {
		
		DaoAuthenticationProvider daoAuth = new DaoAuthenticationProvider();
		
		daoAuth.setUserDetailsService(userDetailsService);
		daoAuth.setPasswordEncoder(new BCryptPasswordEncoder(15) );
		return daoAuth;
	}


	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		  http
		    .csrf().disable()
		    .cors().disable();
		  
		    /*
		    .exceptionHandling()
		     .authenticationEntryPoint(restAuthenticationEntryPoint)
		    .and()
		    .authorizeRequests()
		    .antMatchers(HttpMethod.GET,"/employee/**").authenticated()
		    .antMatchers(HttpMethod.GET, "/dept/**").hasRole("USER")
            .antMatchers(HttpMethod.POST, "/books").hasRole("ADMIN")
            .and()
		    .formLogin().disable() ;
		    .and()
		    .logout();
		    */
	}
	
	
	
	/*
	@Bean
	@Override
	protected UserDetailsService userDetailsService() {
		
		List<UserDetails> users = new ArrayList<UserDetails>();
		users.add(User.withDefaultPasswordEncoder().username("Sumit").password("Sumit").roles("ADMIN").build());
		return new InMemoryUserDetailsManager(users);
	}
	
	*/
	
	

}
