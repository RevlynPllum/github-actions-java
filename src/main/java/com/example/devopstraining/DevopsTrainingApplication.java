package com.example.devopstraining;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DevopsTrainingApplication {

    protected DevopsTrainingApplication() {
        // Protected constructor to satisfy Checkstyle while allowing Spring to instantiate
    }

    public static void main(final String[] args) {
        SpringApplication.run(DevopsTrainingApplication.class, args);
    }
}
