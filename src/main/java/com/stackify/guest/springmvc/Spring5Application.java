package com.stackify.guest.springmvc;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.SpringApplication;

/**
 * Created by john on 08/11/17.
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.stackify.guest.springmvc"})
public class Spring5Application {

    public static void main(String[] args) {
        SpringApplication.run(Spring5Application.class, args);
    }

}