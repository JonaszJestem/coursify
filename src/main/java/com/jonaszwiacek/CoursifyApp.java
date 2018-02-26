package com.jonaszwiacek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = {"com.jonaszwiacek.Configuration", "com.jonaszwiacek.Controllers",
"com.jonaszwiacek.Services", "com.jonaszwiacek.Repositories"})
public class CoursifyApp {
    public static void main(String[] args) {
        SpringApplication.run(CoursifyApp.class);
    }
}
