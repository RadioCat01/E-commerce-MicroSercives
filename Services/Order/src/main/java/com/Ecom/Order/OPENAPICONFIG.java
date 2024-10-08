package com.Ecom.Order;



import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OPENAPICONFIG {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Order-Api")
                        .version("1.0")
                        .description("This is a sample Spring Boot REST service using OpenAPI 3."));
    }
}
