package com.example.obrestdatajpa.config;

import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuracion OpenApi para la generacion de documentacion de la API REST
 */
@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI api(){

        return new OpenAPI()
                .info(new Info()
                .title("sample application API")
                .version("appVersion")
                .description("appDescription")
                .termsOfService("http://swagger.io/terms/"));


    }
}






