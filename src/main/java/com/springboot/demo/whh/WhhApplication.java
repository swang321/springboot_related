package com.springboot.demo.whh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;


/**
 * @author admin
 */
@SpringBootApplication
@ServletComponentScan(basePackages = {"com.springboot.whh"})
public class WhhApplication {

    public static void main(String[] args) {
        SpringApplication.run(WhhApplication.class, args);
    }

}
