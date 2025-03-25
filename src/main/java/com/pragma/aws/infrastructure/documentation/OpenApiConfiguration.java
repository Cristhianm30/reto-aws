package com.pragma.aws.infrastructure.documentation;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfiguration {
    @Bean
    public OpenAPI myOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("AWS")
                        .description("Reto AWS")
                        .version("v1.0"));
    }
}
