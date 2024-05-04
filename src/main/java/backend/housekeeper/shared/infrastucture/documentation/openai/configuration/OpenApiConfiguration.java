package backend.housekeeper.shared.infrastucture.documentation.openai.configuration;

import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfiguration {
    @Bean
    public OpenAPI houseKeeperPlatformOpenApi(){
        return new OpenAPI()
                .info(new Info().title("House Keeper API")
                        .description(
                                "House Keeper Application REST API Documentation")
                        .version("v1.0.0")
                        .license(new License().name("Apache 2.0").url("https://springdoc.org")))
                .externalDocs(new ExternalDocumentation()
                        .description("House Keeper Wiki Documentation")
                        .url("https://house-elegant-service.wiki.github.org/docs"));
    }
}
