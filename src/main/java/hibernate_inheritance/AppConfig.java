package hibernate_inheritance;


import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories("hibernate_inheritance.repository")
public class AppConfig {
}
