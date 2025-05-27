package org.example.jointhemembership;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class JointhemembershipApplication {

    public static void main(String[] args) {
        SpringApplication.run(JointhemembershipApplication.class, args);
    }

}
