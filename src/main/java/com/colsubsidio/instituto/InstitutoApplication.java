package com.colsubsidio.instituto;

import java.util.Collections;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan(basePackages = "com.colsubsidio")
@EntityScan("com.colsubsidio.entities")
@EnableJpaRepositories("com.colsubsidio.repositories")
public class InstitutoApplication {

    public static void main(String[] args) {

        SpringApplication app = new SpringApplication(InstitutoApplication.class);
        app.setDefaultProperties(Collections.singletonMap("server.port", "8085"));//errores
         app.run(args);//ejecute
    }

}
