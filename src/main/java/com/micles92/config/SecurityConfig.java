package com.micles92.config;

import com.micles92.service.UserService;
import com.micles92.service.impl.CustomUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.sql.DataSource;

/**
 * Created by lesiulol on 16.04.16.
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    DataSource dataSource;

    @Autowired
    UserService userService;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        //auth.jdbcAuthentication().dataSource(dataSource).usersByUsernameQuery("SELECT login, password, true FROM USER WHERE login = ?").authoritiesByUsernameQuery("SELECT login, 'ROLE_USER' FROM USER WHERE login=?");

        auth.userDetailsService(new CustomUserDetailsService(userService));
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/resources/**");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
       http
               .authorizeRequests()
               .antMatchers("/register").permitAll()
               .anyRequest().authenticated()
               .and()
               .formLogin().loginPage("/login").defaultSuccessUrl("/").permitAll().and().logout().permitAll().logoutUrl("/logout").logoutSuccessUrl("/login?logoutSuccess");

    }
}
