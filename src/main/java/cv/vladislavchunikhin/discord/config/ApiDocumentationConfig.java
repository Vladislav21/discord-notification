package cv.vladislavchunikhin.discord.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.context.annotation.Configuration;

/**
 * Doc configuration.
 * start page: http://{host}:{port}/swagger-ui.html
 */
@OpenAPIDefinition(
        info = @Info(
                title = "Application for notification by Discord",
                contact = @Contact(
                        name = "Vladislav Chunikhin",
                        url = "https://www.facebook.com/vladislav.chunikhin.12",
                        email = "vladislav.chunikhin.95@gmail.com"
                )
        ),
        servers = {
                @Server(url = "http://localhost:8080")
        }
)
@Configuration
public class ApiDocumentationConfig {
}
