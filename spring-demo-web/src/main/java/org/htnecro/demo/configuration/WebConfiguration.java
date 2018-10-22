package org.htnecro.demo.configuration;

import org.htnecro.demo.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.inject.Inject;

@EnableWebSecurity
public class WebConfiguration {

    @Configuration
    public static class InterceptorConfiguration implements WebMvcConfigurer {

        private final LoginInterceptor loginInterceptor;

        @Inject
        public InterceptorConfiguration(LoginInterceptor loginInterceptor) {
            this.loginInterceptor = loginInterceptor;
        }

        @Override
        public void addInterceptors(InterceptorRegistry registry) {
            registry.addInterceptor(loginInterceptor);
        }
    }

    @Configuration
    public static class SecurityConfiguration extends WebSecurityConfigurerAdapter {

        @Override
        protected void configure(HttpSecurity http) throws Exception {
            http
                    .authorizeRequests()
                    .anyRequest().hasRole("ADMIN")
                    .and()
                    .formLogin().and()
                    .httpBasic();
        }

        @SuppressWarnings("deprecation")
        @Bean
        public UserDetailsService userDetailsService() {
            User.UserBuilder users = User.withDefaultPasswordEncoder();
            InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
            manager.createUser(users.username("admin").password("password").roles("ADMIN").build());
            return manager;
        }
    }
}
