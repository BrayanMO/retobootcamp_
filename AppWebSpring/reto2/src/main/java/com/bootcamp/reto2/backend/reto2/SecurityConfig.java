// package com.bootcamp.reto2.backend.reto2;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
// import org.springframework.security.web.SecurityFilterChain;
// import static org.springframework.security.config.Customizer.withDefaults;

// @Configuration
// @EnableWebSecurity
// public class SecurityConfig {

//     @Bean
//     public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//         http
//                 .authorizeHttpRequests(auth -> auth
//                         .requestMatchers("/api/hospitales/listar").authenticated()
//                         .anyRequest().permitAll())
//                 .formLogin(login -> login
//                         .loginPage("/login") // Ruta de tu login
//                         .defaultSuccessUrl("/api/hospitales/listar", true) // Redirección después del login
//                         .permitAll())
//                 .logout(logout -> logout.logoutSuccessUrl("/login").permitAll());

//         return http.build();
//     }

// }
