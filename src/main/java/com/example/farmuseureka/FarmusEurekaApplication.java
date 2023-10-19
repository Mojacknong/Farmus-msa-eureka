package com.example.farmuseureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FarmusEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(FarmusEurekaApplication.class, args);
    }

}
