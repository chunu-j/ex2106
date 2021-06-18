package org.zerock.ex2106;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Ex2106Application {

    public static void main(String[] args) {

        SpringApplication.run(Ex2106Application.class, args);

    }
}
