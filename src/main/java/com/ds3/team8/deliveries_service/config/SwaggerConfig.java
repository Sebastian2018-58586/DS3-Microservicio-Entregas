package com.ds3.team8.deliveries_service.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    // Configuración de Swagger para la API REST
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Microservicio de entregas") // Título de la API
                        .version("1.0.0") // Versión de la API
                        .description("Documentación de la API del microservicio de entregas")); // Descripción de la API
    }
}
