package com.example.cv_tracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CvTrackerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CvTrackerApplication.class, args);
    }

}
