package com.vaadin.starter.bakery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.vaadin.starter.bakery.app.security.SecurityConfiguration;
import com.vaadin.starter.bakery.backend.data.entity.User;
import com.vaadin.starter.bakery.backend.repositories.UserRepository;
import com.vaadin.starter.bakery.backend.service.UserService;
import com.vaadin.starter.bakery.ui.MainView;

/**
 * A classe principal da  a aplicação Spring Boot.
 * Esta classe serve como ponto de entrada para iniciar a aplicação..
 */
@SpringBootApplication(scanBasePackageClasses = { SecurityConfiguration.class, MainView.class, Application.class,
        UserService.class }, exclude = ErrorMvcAutoConfiguration.class)
@EnableJpaRepositories(basePackageClasses = { UserRepository.class })
@EntityScan(basePackageClasses = { User.class })
public class Application extends SpringBootServletInitializer {

    /**
     * O método principal que é o ponto de entrada da aplicação Spring Boot.
     *
     * @param args argumentos de linha de comando passados no início da aplicação.
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    /**
     * Configura a aplicação para ser executada em um contêiner de servlet externo.
     *
     * @param application um builder para a {@link SpringApplication} e o {@code ApplicationContext}.
     * @return o builder configurado.
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }
}
