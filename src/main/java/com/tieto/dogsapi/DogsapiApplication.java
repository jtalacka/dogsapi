package com.tieto.dogsapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
public class DogsapiApplication {

    public static void main(String[] args) {
        SpringApplication.run(DogsapiApplication.class, args);
    }

}
