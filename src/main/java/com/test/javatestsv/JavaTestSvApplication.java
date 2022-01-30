package com.test.javatestsv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.test.javatestsv")
public class JavaTestSvApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaTestSvApplication.class, args);
    }

}
