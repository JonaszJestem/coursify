package com.jonaszwiacek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan("com.jonaszwiacek.Controllers")
public class CoursifyApp {
    public static void main(String[] args) {
        SpringApplication.run(CoursifyApp.class);
    }
}
