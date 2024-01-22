package com.example.swp_mvc.config.security;

import com.example.swp_mvc.controller.CustomSuccessHandle;
import com.example.swp_mvc.service.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private IUserService userService;
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService((UserDetailsService) userService)
                .passwordEncoder(passwordEncoder());
//        auth.inMemoryAuthentication()
//                .withUser("user").password("{noop}12345").roles("USER")
//                .and()
//                .withUser("admin").password("{noop}12345").roles("ADMIN");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests()
                .requestMatchers("/**").permitAll()
//                .requestMatchers("/user**").hasRole("USER")
//                .requestMatchers("/admin**").hasRole("ADMIN")
//                .requestMatchers("/type**").hasRole("ADMIN")
                .and()
                .formLogin(Customizer.withDefaults())
                .logout()
                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                .and()
                .exceptionHandling().accessDeniedPage("/accessDenied");
        http.csrf().disable();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder(10);
    }
}
