package com.crazykim.swagger.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Open API Swagger 설정
 */
@Configuration
public class OpenAPIConfig {

    @Bean
    public OpenAPI openAPI() {

        Info info = new Info().title("crazyKim").version("1")
                .description("crazyKim Swagger Test Project입니다.");

        return new OpenAPI()
                .info(info);
    }

}
