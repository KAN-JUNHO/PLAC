package com.example.plac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;

@SpringBootApplication
public class PlacApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlacApplication.class, args);
    }

}
