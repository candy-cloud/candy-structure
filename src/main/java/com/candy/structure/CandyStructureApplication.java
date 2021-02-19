package com.candy.structure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CandyStructureApplication {

    public static void main(String[] args) {
        SpringApplication.run(CandyStructureApplication.class, args);
    }

}
