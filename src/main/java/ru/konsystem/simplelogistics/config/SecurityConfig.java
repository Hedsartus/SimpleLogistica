package ru.konsystem.simplelogistics.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import ru.konsystem.simplelogistics.config.security.jwt.JwtAuthEntryPoint;
import ru.konsystem.simplelogistics.config.security.jwt.JwtConfigurer;
import ru.konsystem.simplelogistics.config.security.jwt.JwtTokenProvider;

import java.util.List;

@Configuration
@RequiredArgsConstructor
public class SecurityConfig {
    private final JwtTokenProvider jwtTokenProvider;
    private final JwtAuthEntryPoint jwtAuthEntryPoint;
    private static final String LOGIN_ENDPOINT = "/login";
    private static final String FRONT_ORIGIN = "http://localhost:3000";
    private static final List<String> METHODS = List.of("GET", "POST", "PUT", "DELETE", "OPTIONS");

    @Bean
    public AuthenticationManager authenticationManagerBean(AuthenticationConfiguration authConfig) throws Exception {
        return authConfig.getAuthenticationManager();
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .cors()
                .and()
                .httpBasic().disable()
                .csrf().disable()
                .sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS);
//                .and()
//                .exceptionHandling().authenticationEntryPoint(jwtAuthEntryPoint)
//                .and()
//                .authorizeHttpRequests()
//                .requestMatchers("/v1/api/admin/**").hasRole("ADMIN")
//                .requestMatchers(LOGIN_ENDPOINT, "/index.html", "/typeorg", "/org", "/org/edit").permitAll()
//                .anyRequest().authenticated()
//                .and()
//                .apply(new JwtConfigurer(jwtTokenProvider))
//                .and()
//                .logout()
//                .clearAuthentication(true)
//                .deleteCookies("auth-token");

        return http.build();
    }

    @Bean
    public CorsConfigurationSource corsConfigurationSource() {
        final var cors = new CorsConfiguration();
        cors.setAllowedOriginPatterns(List.of("*"));
        cors.setAllowedOrigins(List.of(FRONT_ORIGIN));
        cors.setAllowedMethods(METHODS);
        cors.setAllowedHeaders(List.of("*"));
        cors.setAllowCredentials(true);

        final var source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", cors);

        return source;
    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}