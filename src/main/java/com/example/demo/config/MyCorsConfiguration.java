package com.example.demo.config;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyCorsConfiguration implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // Permite acceder a todos los endpoints
            .allowedMethods("*") // Permite todos los métodos HTTP: GET, POST, etc.
            .allowedOrigins("*") // Permite todas las URLs
            .allowedHeaders("*"); // Permite todos los encabezados
    }
}
