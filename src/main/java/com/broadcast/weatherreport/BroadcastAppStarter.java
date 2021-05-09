package com.broadcast.weatherreport;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
public class BroadcastAppStarter {

    public static void main(String[] args) {
        SpringApplication.run(BroadcastAppStarter.class, args);
    }
}
